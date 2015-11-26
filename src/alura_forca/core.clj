  (ns alura-forca.core
    (:gen-class))

  (def total-de-vidas 6)

  (defn perdeu [] (println "Você perdeu!"))
  (defn ganhou [] (println "Você ganhou!"))

  (defn letras-faltantes [palavra acertos]
    (remove (fn [letra] (contains? acertos (str letra))) palavra))

  (defn acertou-palavra-toda? [palavra acertos]
    (empty? (letras-faltantes palavra acertos)))

  (defn le-letra! []
    (read-line))

  (defn acertou? [chute palavra]
    (.contains palavra chute))

  (defn jogo [vidas palavra acertos]
    (cond
      (= vidas 0) (perdeu)
      (acertou-palavra-toda? palavra acertos) (ganhou)
      :else
      (let [chute (le-letra!)]
        (if (acertou? chute palavra)
          (do
            (println "Acertou letra!")
            (recur vidas palavra (conj acertos chute)))
          (do
            (println "Errou! Perdeu vida!")
            (recur (dec vidas) palavra acertos))))))

  (defn -main
    "I don't do a whole lot ... yet."
    [& args]
    (println "Hello, World!"))
