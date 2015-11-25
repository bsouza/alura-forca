(ns alura-forca.io
  (:gen-class))

(defn le-letra! [] (read-line))

(defn multiplica-entrada []
  (* 7 (Integer/parseInt (le-letra!))))
