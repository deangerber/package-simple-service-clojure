.PHONY: test

test:
	clj -A:test

server:
	clj -m hello.core
