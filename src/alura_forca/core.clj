(ns alura-forca.core
  (:gen-class))

(def total-de-vidas 6)

(defn perdeu [] (println "Você perdeu!"))
(defn ganhou [] (println "Você ganhou!"))

(defn letras-faltantes [palavra acertos]
  (remove (fn [letra] (contains? acertos (str letra))) palavra))

(defn acertou-palavra-toda? [palavra acertos]
  (empty? (letras-faltantes palavra acertos)))

(defn jogo [vidas palavra acertos]
  (if (= vidas 0)
    (perdeu)
    (if (acertou-palavra-toda? palavra acertos)
      (ganhou)
      (print "Chuta, amigo!"))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
