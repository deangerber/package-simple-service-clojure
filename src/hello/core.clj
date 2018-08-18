(ns hello.core
  (:require [ring.util.response :as res]
            [ring.adapter.jetty :as jetty]))

(defn handler [request]
  (res/content-type (res/response "Hello World!") "text/plain"))

(defn -main [& args]
  (jetty/run-jetty handler {:port (Integer/valueOf (or (System/getenv "port") "3000"))}))
