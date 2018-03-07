(set-env!
  :dependencies '[[seancorfield/boot-tools-deps "0.4.3" :scope  "test"]]
  :resource-dirs #{"src"})

(require '[boot-tools-deps.core :refer  [deps]])
