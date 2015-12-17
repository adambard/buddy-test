(set-env!
  :source-paths #{"src"}
  :resource-paths #{"resources"}
  :dependencies '[[buddy "0.8.3"]
                  [ring "1.4.0"]
                  [compojure "1.4.0"]])

(require '[buddy-test.app :refer [-main]])

(deftask serve []
  (fn [handler]
    (fn [fileset]
      (-main)
      (handler fileset))))
