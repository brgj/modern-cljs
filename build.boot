(set-env!
  :source-paths #{"src/cljs"}
  :resource-paths #{"html"}

  :dependencies '[[org.clojure/clojure "1.8.0"]         ;; add CLJ
                  [org.clojure/clojurescript "1.9.473"] ;; add CLJS
                  [adzerk/boot-cljs "1.7.228-2"]
                  [pandeiro/boot-http "0.7.6"]          ;; add http dependency
                  [org.clojure/tools.nrepl "0.2.12"]    ;; required by boot-http
                  [adzerk/boot-reload "0.5.1"]          ;; add boot-reload
                  [adzerk/boot-cljs-repl "0.3.3"]
                  [com.cemerick/piggieback "0.2.1"]     ;; needed by bREPL
                  [weasel "0.7.0"]                      ;; needed by bREPL
                  ])

(require '[adzerk.boot-cljs :refer [cljs]]
         '[pandeiro.boot-http :refer [serve]]                   ;; make serve task visible
         '[adzerk.boot-reload :refer [reload]]                  ;; make reload visible
         '[adzerk.boot-cljs-repl :refer [cljs-repl start-repl]  ;; make it visible
          ])
