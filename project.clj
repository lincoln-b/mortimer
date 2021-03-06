(defproject mortimer "0.1.0-SNAPSHOT"
  :description "A tool to trace every function call in a Clojure file."
  :aot [mortimer.main]
  :main mortimer.main
  :url "https://github.com/lincoln-b/mortimer"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [riddley "0.1.14"]
                 [org.clojure/core.incubator "0.1.4"]])
