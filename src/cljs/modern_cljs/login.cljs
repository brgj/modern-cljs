(ns modern-cljs.login
  (:require [domina.core :refer [by-id value]]))

;; define the function to be attached to form submission event
(defn validate-form []
  ;; get email and password element from their ids in the HTML form
  (if (and (> (count (value (by-id "email"))) 0)
           (> (count (value (by-id "password"))) 0))
    true
    (do (js/alert "Please, complete the form!")
        false)))

;; define the function to attach validate-form to onsubmit event of
;; the form
(defn ^:export init []
  ;; verify that js/document exists and that it has a getElementById
  ;; property
  (if (and js/document
    (.-getElementById js/document))
      ;; get loginForm by element id and set its onsubmit property to
      ;; our validate-form function
      (let [login-form (by-id "loginForm")]
        (set! (.-onsubmit login-form) validate-form))
  )
)

;; (set! (.-onload js/window) init)
