import akka.actor.{Actor, ActorSystem, Props}
import akka.io.IO
import com.typesafe.config.ConfigFactory
import spray.can.Http
import spray.routing.HttpService

object Main extends App {
  val config = ConfigFactory.load()

  implicit val system = ActorSystem("my-system", config)

  // create and start our service actor
  val service = system.actorOf(Props[MyServiceActor], "my-service")

  // create a new HttpServer using our handler tell it where to bind to
  IO(Http) ! Http.Bind(service, config.getString("http.address"), config.getInt("http.port"))
}

class MyServiceActor extends Actor with HttpService {
  val myRoute =
    path("") {
      get {
        complete {
          "HTTP sample app up and running!"
        }
      }
    }

  def actorRefFactory = context

  def receive = runRoute(myRoute)
}