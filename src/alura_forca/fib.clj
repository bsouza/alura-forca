(ns alura-forca.fib
  (:gen-class))

(defn maior-que-um? [numero] (> numero 1))

(defn fib-old [numero]
  (if (maior-que-um? numero)
    (+ (fib-old (dec numero)) (fib-old (- numero 2)))
    numero
  )
)


(defn fib[x]
    (loop [a 1 b 1 numero 2]
        (if
            (= numero x) b
            (recur b (+ a b) (inc numero))
        )
    ))


(defn soma[n]
  (loop [contador 1 soma 0]
    (if (> contador n) soma
    (recur (inc contador) (+ contador soma)))))
