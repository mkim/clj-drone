(ns clj-drone.commands)

(def commands
  {
    :take-off   {:command-class "AT*REF" :command-bit-vec [9 18 20 22 24 28]}
    :land       {:command-class "AT*REF" :command-bit-vec [18 20 22 24 28]}
    :emergency  {:command-class "AT*REF" :command-bit-vec [8 18 20 22 24 28]}
    :spin-right {:command-class "AT*PCMD":command-bit-vec [] :command-vec [1 0 0 0 :v] :dir 1} ;val (0-1)
    :spin-left  {:command-class "AT*PCMD":command-bit-vec [] :command-vec [1 0 0 0 :v] :dir -1} ;val (0-1)
    :up         {:command-class "AT*PCMD":command-bit-vec [] :command-vec [1 0 0 :v 0] :dir 1} ;val (0-1)
    :down       {:command-class "AT*PCMD":command-bit-vec [] :command-vec [1 0 0 :v 0] :dir -1} ;val (0-1)
    :tilt-back  {:command-class "AT*PCMD":command-bit-vec [] :command-vec [1 0 :v 0 0] :dir 1} ;val (0-1)
    :tilt-front {:command-class "AT*PCMD":command-bit-vec [] :command-vec [1 0 :v 0 0] :dir -1} ;val (0-1)
    :tilt-right {:command-class "AT*PCMD":command-bit-vec [] :command-vec [1 :v 0 0 0] :dir 1} ;val (0-1)
    :tilt-left  {:command-class "AT*PCMD":command-bit-vec [] :command-vec [1 :v 0 0 0] :dir -1} ;val (0-1)
    :hover      {:command-class "AT*PCMD":command-bit-vec [] :command-vec [0 0 0 0 0] :dir 1}
    :fly        {:command-class "AT*PCMD":command-bit-vec [] :command-vec [1 :v :w :x :y] :dir 1}
    })