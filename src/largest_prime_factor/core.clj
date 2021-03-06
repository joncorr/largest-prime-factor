(ns largest-prime-factor.core
  (:gen-class)
  (:import (java.lang.Math)))

(defn get-factors
 ([number]
 (get-factors 1 number))
 ([start number]
  (let [stop (int (Math/sqrt number))
        factors (conj #{1} number)]
    (sort (into factors (for [i (range start (inc stop))
    :when (zero? (mod number i))] i))))))

(defn prime? [number]
   (if (<= number 1)
    false
    (if (= number 2)
     true
     (= nil (first
      (for [i (range 2 number)
      :when (zero? (mod number i))] i))))))

 (defn get-prime-factors [number]
    (filter prime? (get-factors number)))

 (defn get-largest-prime-factor [number]
    (last (get-prime-factors number)))

(defn -main [& args]
 (let [number 600851475143
       largest-prime-factor (time (get-largest-prime-factor number))]
 (println (str "The largest prime number of 600851475143 is "
           largest-prime-factor))))
