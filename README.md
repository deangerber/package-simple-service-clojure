# Packaging a simple HTTP Service using Clojure

Packaging a simple HTTP service using Clojure CLI and deps.edn.

## Requirements

The sample application has the following requirements.

* Java 10.0.2
* Clojure 1.9.0

## Usage

### From the command line

To execute the test case.

~~~ bash
clj -A:test
~~~

To run the http endpoint.

~~~ bash
clj -m hello.core
~~~

To package the endpoint in a jar.

~~~ bash
clj -A:pack -m mach.pack.alpha.capsule uberjar.jar -m hello.core
~~~

### Using the included Makefile

To execute the test case.

~~~ bash
make test
~~~

To run the http endpoint.

~~~ bash
make server
~~~

To package the endpoint in a jar.

~~~ bash
make uberjar
~~~

## References

* [Java](http://www.oracle.com/technetwork/java/index.html)
* [Clojure](https://clojure.org/index)
* [Clojure Deps and CLI Guide](https://clojure.org/guides/deps_and_cli)
* [Jetty](https://www.eclipse.org/jetty/)
* [JUXT pack.alpha](https://github.com/juxt/pack.alpha)
