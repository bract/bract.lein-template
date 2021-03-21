# bract.lein-template

A Leiningen template to create [Bract](https://bract.github.io) applications. The generated
application is minimal but can be easily extended either with Bract modules or with inducers.


Latest version (on Clojars): `0.1.1`


### Out of the box features

- Development workflow
  - Tweaking verbosity and configuration at the REPL
  - Easy customizable integration with clojure.test (any test framework)
  - REPL support for starting/stopping app


### Bract modules/Libraries used

- [bract.core](https://github.com/bract/bract.core)
  - [Keypin](https://github.com/kumarshantanu/keypin) for configuration files
- [bract.dev](https://github.com/bract/bract.dev) in DEV mode only
  - [org.clojure/tools.namespace](https://github.com/clojure/tools.namespace) for "reloaded" REPL workflow


## Usage

```shell
lein new bract <project-name>
cd <project-name>
# see README.md
```


## License

Copyright © 2020-2021 [Shantanu Kumar](https://github.com/kumarshantanu)

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
