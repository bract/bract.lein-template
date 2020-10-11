(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME"
  :url "FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :resource-paths ["resources" "target/generated/resources"]  ; see :project-edn entry
  :pedantic?    :warn
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [bract/bract.core "0.6.2-alpha2"]]
  :target-path "target/%s"
  :plugins [[lein-project-edn "0.2.0"]]
  :hooks [leiningen.project-edn/activate]
  :project-edn {:output-file "target/generated/resources/project.edn"
                :verify-edn? true}
  :main ^:skip-aot bract.core.main
  :profiles {:dev     {:dependencies [[bract/bract.dev "0.6.2-0.2.0-alpha2"]]
                       :repl-options {:port 3001
                                      :init-ns bract.core.dev}}
             :uberjar {:aot [bract.core.main]
                       :pedantic? :abort}})
