(ns alura-forca.fib
  (:gen-class))

(def zero-ou-um #{0 1})

(defn eh-zero-ou-um [numero]
  (contains? zero-ou-um numero)
)

(defn fib [numero]
  (if (not (zero-ou-um numero))
    (+ (fib (dec numero)) (fib (- numero 2)))
    numero
  )
)
