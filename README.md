# onyx-spec

Clojure specs for Onyx core.

## Usage

In your project file:

```clojure
[org.onyxplatform/onyx-spec "0.13.0.0-beta1"]
```

In your peer boot-up namespace:

```clojure
(:require [onyx.spec])
```

## Doo

For cljs testing run:

`npm install karma karma-cljs-test karma-chrome-launcher --save-dev`

to get everything setup. Then run:

`lein doo once`

to run the tests.

Note: You need to update `/test/onyx/spec/test_runner.cljs` whenever you rename or add cljs targeted test files.

## License

Copyright © 2017 Distributed Masonry

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
