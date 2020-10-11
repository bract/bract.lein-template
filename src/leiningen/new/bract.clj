(ns leiningen.new.bract
  (:require [leiningen.new.templates :refer [renderer year date name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "bract"))

(defn bract
  "Generate 'bract' application."
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)
              :year (year)
              :date (date)}]
    (main/info "Generating fresh 'lein new' Bract project.")
    (->files data
      ["project.clj" (render "project.clj" data)]
      ["README.md"   (render "README.md"   data)]
      ["src/{{sanitized}}/core.clj"      (render "src/core.clj" data)]
      ["test/{{sanitized}}/core_test.clj" (render "test/core_test.clj" data)]
      ["resources/bract-context.edn"     (render "resources/bract-context.edn" data)]
      ["test/bract-context.dev.edn"      (render "test/bract-context.dev.edn" data)]
      ["resources/baseconfig.edn"        (render "resources/baseconfig.edn" data)]
      )))
