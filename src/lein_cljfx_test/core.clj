(ns lein-cljfx-test.core
  (:require [cljfx.api :as fx])
  (:gen-class)
  (:import [javafx.application Platform]
           (javafx.event EventHandler)))

(defn fx-test []
  (fx/on-fx-thread
    (fx/create-component
      {:fx/type :stage
       :showing true
       :scene   {:fx/type :scene
                 :root    {:fx/type  :v-box
                           :children [{:fx/type :label
                                       :text    "Hello from lein!"}]}}})))

(defn frenchy64 []
  (if *compile-files*
    (try
      (fx-test)
      (catch IllegalStateException _
        ))))

(defn -main [& args]
  ;(fx-test)
  (frenchy64)
  )
