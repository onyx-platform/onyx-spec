(ns onyx.spec.spec-test
    (:require 
      [clojure.test :refer [deftest is testing]]
      [onyx.spec :as spec]
      [clojure.spec.alpha :as s]))

(deftest test-test
  (let []
    (is (s/valid? :onyx/name ::name))))
