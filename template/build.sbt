import com.typesafe.sbt.SbtNativePackager._
import NativePackagerKeys._

packageArchetype.java_application

scalaVersion := "2.11.2"

libraryDependencies := Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.4",
  "io.spray" %% "spray-can" % "1.3.1",
  "io.spray" %% "spray-routing" % "1.3.1"
)
