(ns onyx.spec.test-runner
    (:require
     [doo.runner :refer-macros [doo-tests]]
     [onyx.spec.spec-test]))
  
(enable-console-print!)
  
(doo-tests 'onyx.spec.spec-test)
  
