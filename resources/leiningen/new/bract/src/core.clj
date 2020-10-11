(ns {{name}}.core
  (:require
    [bract.core.keydef :as bc-kdef]
    [keypin.core :as keypin]))


(keypin/defkey
  app-version  ["app.version"  string? "Application version"]
  app-hostname ["app.hostname" string? "Application hostname"])


(defn launch
  [context]
  (println "Hello, world!")
  (let [app-config (bc-kdef/ctx-config context)]
    (println (format "{{name}} version %s running on host %s"
               (app-version app-config) (app-hostname app-config))))
  context)
