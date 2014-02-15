(defproject clygments "0.1.1"
  :description "Use Pygments from Clojure"
  :url "http://github.com/bfontaine/clygments"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure          "1.5.1"]
                 [org.python/jython-standalone "2.5.3"]
                 [org.pygments/pygments        "1.6"]]
  :plugins [[lein-cloverage "1.0.2"]])
