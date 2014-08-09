SNPU
====

OpenShift cartridge for Universal packages created by SBT Native Packager plugin.

Create new app with:

    rhc --debug create-app --timeout 600 mynewapp http://cartreflect-claytondev.rhcloud.com/reflect?github=2m/openshift-cartridge-sbt-native-packager-universal

Exposed environment variables
-----------------------------

This cartridge exposes the following environment variables for application to use

|Name                           |Description                                    |
|-------------------------------|-----------------------------------------------|
|OPENSHIFT_IP                   |The IP address for your application to bind to |
|OPENSHIFT_PORT                 |The port for your application to bind to       |
