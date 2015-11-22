(ns alura-forca.fib
  (:gen-class))

(defn maior-que-um? [numero] (> numero 1))

(defn fib [numero]
  (if (maior-que-um? numero)
    (+ (fib (dec numero)) (fib (- numero 2)))
    numero
  )
)
