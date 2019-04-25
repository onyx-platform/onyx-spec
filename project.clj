(defproject org.onyxplatform/onyx-spec "0.14.1.1"
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
                 [org.clojure/clojurescript "1.10.238"]
                 [org.onyxplatform/onyx "0.14.1"]
                 [org.clojure/test.check "0.9.0"]]
  :clean-targets ^{:protect false} [:target-path :compile-path "resources/public/js"]
  :doo {:build "test"
        :alias {:default [:chrome-headless]}}
  :cljsbuild {:builds
              [{:id "test"
                :source-paths ["test"]
                :compiler {:output-to "resources/public/js/compiled_test/onyx_sim_test.js"
                           :output-dir "resources/public/js/compiled_test/out"
                           :main onyx.spec.test-runner
                           :optimizations :none}}]}

  :plugins [[codox "0.8.8"]
            [lein-set-version "0.4.1"]
            [lein-update-dependency "0.1.2"]
            [lein-pprint "1.1.1"]
            [lein-doo "0.1.8"]])
