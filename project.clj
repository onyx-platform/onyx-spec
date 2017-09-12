(defproject org.onyxplatform/onyx-spec "0.11.0.0-SNAPSHOT"
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
  :dependencies [[org.clojure/clojure "1.9.0-alpha20"]])
