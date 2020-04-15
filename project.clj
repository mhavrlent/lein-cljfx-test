(defproject lein-cljfx-test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                [cljfx "1.6.7"]]
  :main ^:skip-aot lein-cljfx-test.core
  :target-path "target/%s"

  ;; default - use with frenchy64
  :profiles {:uberjar {:aot :all}}

  ;; ahungry workaround
  ;;:profiles {:uberjar {:aot :all :injections [(javafx.application.Platform/exit)]}}
  )
