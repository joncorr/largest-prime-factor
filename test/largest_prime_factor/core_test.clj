(ns largest-prime-factor.core-test
  (:require [clojure.test :refer :all]
            [largest-prime-factor.core :refer :all]))

(deftest prime?-2
  (testing "2 is a prime number"
      (is (= (prime? 2) true))))

(deftest prime?-1
   (testing "1 is not a prime number"
       (is (false? (prime? 1)))))

(deftest prime?-4
  (testing "4 is not a prime number"
      (is (= (prime? 4) false))))

 (deftest prime?-11
      (is (= (prime? 13) true)))

 (deftest largest-prime-factor-of13195-is29
      (is (= (get-largest-prime-factor 13195) 29)))

 (deftest largest-prime-factor-of600851475143-is6857
      (is (= (get-largest-prime-factor 600851475143) 6857)))

;; (run-tests 'largest-prime-factor.core-test)
