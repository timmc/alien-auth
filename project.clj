(defproject alien-auth "1.0.0-SNAPSHOT"
  :description "External authentication for Reddit"
  :dependencies [[org.clojure/clojure "1.2.1"]]
  :dev-dependencies [[appengine-magic "0.4.3"]]
  :source-path "src"
  :library-path "war/WEB-INF/lib"
  :javac-options {:destdir "war/WEB-INF/classes"})
