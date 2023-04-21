(ns practicaI
  #_{:clj-kondo/ignore [:unused-namespace]}
  (:require [clojure.set :as set :refer [union]]))

;; 0. Declare una variable con su nombre y apellido. Escriba en un comentario qué 
;;    tipo de dato ha empleado.

(def estudiante {:nombre "Franco"
                 :apellido "milianovich"})

estudiante



;; 1. Cree un vector de números positivos impares hasta el número 21

(def num_pos_imp (range 1 22 2))

(num_pos_imp)



;; 2. Registre los jugadores de dos equipos de basket y dos de fútbol 5. 
;;    Al menos 3 jugadores juegan fútbol y basket. Utilice conjuntos





(def jugadores_futbol #{:jugador1 :jugador2 :jugador3})
(def jugadores_basket #{:jugador1 :jugador3 :jugadore6})
(def jugadores_futbol2 #{:jugador3 :jugador4 :jugador5})
(def jugadores_basket2 #{:jugador5 :jugador6 :jugador7})







;; 2.1 Desde la Dirección de Deportes nos piden una lista (lo que no implica 
;;     devolver esta estructura de datos) de todos los jugadores de ambos
;;     deportes. PISTA: utilizar la función (set/union) -ya el namespace está
;;     requerido arriba con el alias 'set'.



(set/union jugadores_basket jugadores_futbol)

 



;; 2.2 Identifique los jugadores que participan en ambas disciplinas. PISTA: 
;;     Existe una función de conjuntos en el namespace 'clojure.set' para resolver este problema.


(set/intersection jugadores_basket2 jugadores_basket)

;; 2.3 Identifique los jugadores que juegan fútbol, pero no basket. PISTA:
;;     Existe una función de conjuntos en el namespace 'clojure.set' para resolver este problema.

(set/difference jugadores_basket2 jugadores_basket)


;; 3. Cree un mapa con los 5 principales indicadores provistos en la página del INDEC
;;    (https://www.indec.gob.ar/), a saber, población, desocupación, etc. 


(def indicadores {:analfabetismo 1.9
                  :pobresa 39.2
                  :IPImanufacturero 1.4
                  :Tasadeempleo 44,6
                  :Canastabásicatotal 8,3})


;; 3.1 Utilice la función (juxt) para obtener los valores correspondientes a las llaves 
;;     que haya elegido para los indicadores 'Tasa de desocupación' e 'Índice de producción industrial 
;;     manufacturero'. 
;;     NOTA: Al ubicar el cursor sobre la función, podrá ver una ventana con la documentación y ejemplos.


((juxt :Tasadeempleo :Canastabásicatotal) {:pobresa})



;; 3.2 Utilice la función (select-keys) para obtener un mapa con el par llave-valor 
;;     con las llaves que haya elegido para los indicadores 'Población' y 'Precios al consumidor'.

(select-keys {:Canastabásicatotal :pobresa} [:Tasadeempleo])

;; 4. Cree una función que, recibiendo un nombre como argumento, devuelva un saludo. Ejemplo:
;;    (saludar "Juan") => "¡Hola, Juan!"

(defn saludar [juan]
 ( str  "hola "  juan) )

(str "hola " "juan")








(comment 
;; Utilice este espacio para experimentar con el código. Luego, cuando esté seguro que el 
;; código trabaja correctamente, cópielo a su lugar correspondiente arriba.   
  
  )

