# DEVLOG

Humble rants during development.

## 2020-03-12

Wow it modularizes with gradle and still works on every biggest JEE App Server.

Neat.

Might add TomEE to the gang.

Still need to add a simplified documentation regarding database driver and
datasource on every app server.

Noteworthy: since jpa entities lies inside a module (which eventually becomes
a jar), entity names must be listed on persistence.xml inside META-INF.

## 2020-03-07

Websphere Open Liberty was almost easy as Payara!

It's admin console sucks a lot but the server xml configuration is one single,
self-contained file and well-documented.

Change from web profile to full javaee mode is also simple to achieve.

Flyway ranted something about a empty file to help him to find migrations folder.

## 2020-03-06

Finally wildfly accepted the same bare war that glassfish took! 

- Had to set @Produces("application/json") on UserController.kt
- Had to set @TransactionManagement(value = TransactionManagementType.BEAN)
  on Migrations.kt
- Followed the driver as a module tutorial and after that used the manager
  console to create the datasource. WildFly however did not respected the name
  attribute on @Resource(name = "jdbc/sample-ds") and just gave me the default
  datasource. Had to make sample-ds the default one in order to rock the boat.
  
 Also it boots slower than payara. 

## 2020-03-02

tried mydatis-migrations, but there is no use.

a real drag. useless nowadays.

and to think that taught me so much, and now is just a outdated artifact.

going full flyway for this.