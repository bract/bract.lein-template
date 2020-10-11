# {{name}}

FIXME

## Usage

FIXME


## Development

### Run in DEV mode

```shell
lein run
```

### Build & Run

```shell
lein do clean, uberjar
java -jar {{name}}-0.1.0-SNAPSHOT-standalone.jar -vf config/config.edn
```

### REPL support

Start the REPL using `lein repl` command, which drops you into the `bract.core.dev` namespace.

### Running tests

Run the tests using `lein test` command. Application initialization is transparently finished before tests are run.


## License

Copyright © {{year}} FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
