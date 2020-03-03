# sample jee but with kotlin

Work in progress.

One could say that's 'kee', but the 'j' stands for `jakarta` now.

Run it on intellij mostly because kotlin support, but i hope to keep it as
agnostic as possible.

Works on Payara server but should work on other jee-compliant servers

## roadmap

- [X] simple hello world-ish features proven to be quite simple
  - [ ] better instructions regarding datasource configurations
    - [ ] payara
    - [ ] wildfly
    - [ ] wasce
- [X] figure out a decent schema migration [flywaydb](https://flywaydb.org/getstarted/firststeps/api)
- [ ] modularize the gradle project
  - [ ] a project just for the models
  - [ ] one or more projects for the services
  - [ ] one web facade project for the controllers
  - [ ] one for the frontend itself, but maybe not
 - [ ] make it respect profile settings (development, test, production)
 - [ ] prove that it works on any jee8-compatible app server
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

- <https://ralph.blog.imixs.com/2016/10/22/wildfly-install-postgresql-jdbc-driver-as-a-module/>
- <https://cleanprogrammer.net/how-to-configure-datasource-in-wildfly/>
- <http://www.adam-bien.com/roller/abien/entry/installing_oracle_jdbc_driver_on>
- <https://www.stenusys.com/how_to_setup_postgresql_datasource_with_wildfly/> (see 'option 3')

#### IBM WebSphere Application Server Community Edition

_to be done_
