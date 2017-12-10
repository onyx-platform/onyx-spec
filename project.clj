(defproject org.onyxplatform/onyx-spec "0.12.0.1-SNAPSHOT"
  :description "Clojure specs for Onyx core."
  :url "https://github.com/onyx-platform/onyx-spec"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :repositories {"snapshots" {:url "https://clojars.org/repo"
                              :username :env
                              :password :env
                              :sign-releases false}
                 "releases" {:url "https://clojars.org/repo"
                             :username :env
                             :password :env
                             :sign-releases false}}
  :dependencies [[org.clojure/clojure "1.9.0-alpha20"]
                 [org.onyxplatform/onyx "0.12.1-20171210_201907-gb76735f"]]
  :plugins [[codox "0.8.8"]
            [lein-set-version "0.4.1"]
            [lein-update-dependency "0.1.2"]
            [lein-pprint "1.1.1"]])
