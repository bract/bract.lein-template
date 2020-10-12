(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME"
  :url "FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :resource-paths ["resources" "target/generated/resources"]  ; see :project-edn entry
  :pedantic?    :warn
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [bract/bract.core "0.6.2-alpha3"]]
  :target-path "target/%s"
  :plugins [[lein-project-edn "0.2.0"]]
  :hooks [leiningen.project-edn/activate]
  :project-edn {:output-file "target/generated/resources/project.edn"
                :verify-edn? true}
  :profiles {:dev     {:dependencies [[bract/bract.dev "0.6.2-0.2.0-alpha3"]]
                       :main ^:skip-aot bract.core.dev
                       :repl-options {:port 3001
                                      :init-ns bract.dev.repl}}
             :uberjar {:aot [bract.core.main]
                       :main ^:skip-aot bract.core.main
                       :pedantic? :abort}})
