(ns onyx.spec.spec-test
    (:require 
      [clojure.test :refer [deftest is testing]]
      [clojure.test.check :as tc]
      [clojure.test.check.generators :as gen]
      [clojure.test.check.properties :as prop]
      [onyx.spec :as spec]
      [clojure.spec.alpha :as s]))

(deftest test-test
  (let []
    (is (s/valid? :onyx/name ::name))))

(deftest test-triggers
  (do
    (s/exercise-fn `onyx.triggers/next-fire-time)))

















