(ns clj-beers.controllers.beer)

(defn all
  [request]
  (let [name (get-in request [:params :name] "Beer")]
    {:status 200 :body (str "CHEERSSS " name "!\n")}))