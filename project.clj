(defproject clj-beers "0.1.0-SNAPSHOT"
  :description "clj beers"
  :dependencies [[org.clojure/clojure "1.10.3"]
                 ; Compojure - A basic routing library
                 [compojure "1.6.1"]
                 [io.pedestal/pedestal.service "0.5.7"]
                 [io.pedestal/pedestal.route "0.5.7"]
                 [io.pedestal/pedestal.jetty "0.5.7"]
                 [org.slf4j/slf4j-simple "1.7.28"]]
  :resource-paths ["config", "resources"]
  :main ^:skip-aot clj-beers.server
  )
