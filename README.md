# sample jee but with kotlin

Work in progress.

One could say that's 'kee', but the 'j' stands for `jakarta` now.

Run it on intellij mostly because kotlin support, but i hope to keep it as
agnostic as possible.

Works on Payara server but should work on other jee-compliant servers

## roadmap

A few goals in order to say "hey this kotlin thing might really works on JEE" 

- [X] simple hello world-ish features proven to be quite simple
  - [ ] better instructions regarding jdbc driver and datasource configurations
    - [ ] payara
    - [ ] wildfly
    - [ ] websphere open liberty
- [X] figure out a decent schema migration: [flywaydb](https://flywaydb.org/getstarted/firststeps/api)
- [ ] enable integration tests
- [X] modularize the gradle project
  - [X] a project just for the models
  - [X] one or more projects for the services
  - [X] one web facade project for the controllers
  - [ ] one for the frontend itself, but maybe not
  - [X] working on most app servers
     - [X] payara
     - [X] wildfly
     - [X] websphere open liberty 
 - [ ] make it respect profile settings (development, test, production)
 - [ ] prove that it works on any jee8-compatible app server
    - [X] payara
    - [X] wildfly
    - [X] websphere open liberty
 - [ ] run _devmode_ on other IDE's than intellij ultimate

## useful links

- <https://vorozco.com/blog/2019/2019-04-17-Evaluating-Kotlin-caveats-JavaEE.html>
- <https://kotlinlang.org/docs/reference/compiler-plugins.html#all-open-compiler-plugin>

### datasource-related

Configuring a datasource at app-server level is essential in JEE world.

#### Payara

Piece of cake!

- <https://blog.payara.fish/using-postgresql-with-payara-server>

#### WildFly

Take your reading, and always prefer to use admin tools instead of past random xml files over the app-server!

- <http://www.mastertheboss.com/jboss-server/jboss-script/wildfly-how-to-add-an-user>

Various ways to set up the driver as a module and how to define a datasource

- <https://ralph.blog.imixs.com/2016/10/22/wildfly-install-postgresql-jdbc-driver-as-a-module/>
- <https://cleanprogrammer.net/how-to-configure-datasource-in-wildfly/>
- <http://www.adam-bien.com/roller/abien/entry/installing_oracle_jdbc_driver_on>
- <https://www.stenusys.com/how_to_setup_postgresql_datasource_with_wildfly/> (see 'option 3')
- <http://www.mastertheboss.com/jboss-server/jboss-datasource/jboss-datasource-configuration>

The very very important step about how to delegate transaction to the bean

- <http://are-you-ready.de/blog/2017/06/08/integrating-flyway-with-java-ee-and-using-its-datasource/>

How to change the default domain datasource, since there is a bug

- _searching..._

#### IBM Websphere Open Liberty

- <https://openliberty.io/>

The download the full jee profile version. 

- <https://openliberty.io/blog/2018/06/29/full_java_ee_8_liberty_18002.html>
- <https://openliberty.io/blog/2019/09/13/testing-database-connections-REST-APIs.html>
- <https://openliberty.io/docs/ref/config/#dataSource.html#dataSource/properties.postgresql>

Please note that default WAS port is **9080** instead of **8080** like their cousins.

