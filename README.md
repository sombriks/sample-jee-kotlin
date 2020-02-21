# sample jee but with kotlin

Work in progress.

One could say that's 'kee', but the 'j' stands for `jakarta` now.

Run it on intellij mostly because kotlin support, but i hope to keep it as
agnostic as possible.

Works on Payara server but should work on other jee-compliant servers

## roadmap

- [X] simple hello world-ish features proven to be quite simple
- [ ] figure out a decent schema migration
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
