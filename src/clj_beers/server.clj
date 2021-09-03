(ns clj-beers.server
  (:require [io.pedestal.http :as http]
            [clj-beers.service :as service])
  (:gen-class))

(defonce runnable-service (http/create-server service/service))

(defn -main
  "This is our main entry point"
  [& args]
  (println "\nCreating your server...")
  (http/start runnable-service))