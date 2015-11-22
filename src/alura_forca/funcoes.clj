(ns alura-forca.funcoes
  (:gen-class))

(def conjunto #{"L" "M" "A"})

; Exemplos de manipulação de conjuntos

(defn conjunto-contains [letra]
  (if (contains? conjunto letra)
    (println "Contém!")
    (println "Não contém!")))

(defn conjunto-mais [letra]
  (conj conjunto letra))

(defn conjunto-menos [letra]
  (disj conjunto letra))


(def numeros [1 2 3 4])

(defn duplica [x] (* x 2))

(defn duplica-numeros []
  (map duplica numeros))

(defn par? [numero]
  (= 0 (rem numero 2)))

(defn numeros-impares []
  (remove par? numeros))

(defn triplica [x] (* x 3))

(defn numeros-triplicados []
  (map triplica numeros))
