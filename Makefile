.PHONY: test

test:
	clj -A:test

server:
	clj -m hello.core

uberjar:
	clj -A:pack -m mach.pack.alpha.capsule uberjar.jar -m hello.core
