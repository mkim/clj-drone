# clj-drone

Why wouldn't you want to control your AR Drone with your Clojure REPL?

A Clojure library to control the Parrot AR Drone 2.0 [http://ardrone2.parrot.com/](http://ardrone2.parrot.com/)

## Usage

Just beginning the start of the control library,so far only movement
commands are supported
More to come soon.

Sample Usage - Drone Takes off for 10 seconds and then lands

```clojure
(ns clj-drone.example
  (:use clj-drone.core))

(drone-initialize)
(drone :take-off)
(Thread/sleep 10000)
(drone :land)
```

## Commands Supported

```clojure
(drone :take-off)
(drone :land)
(drone :emergency) ; restores control of drone after emergency landing
(drone :hover)
```

The movement commands take argument from 0-1

```clojure
(drone :spin-right 0.5)
(drone :spin-left 1)
(drone :up 0.5)
(drone :down 1)
(drone :tilt-back 0.3)
(drone :tilt-front 1)
(drone :tilt-right 1)
(drone :tilt-left 1)
```

The fly command takes arguments left-right tilt, front-back tilt,
vertical speed, angular speed.  The arguments are all in the range -1
to 1.

```clojure
(drone :fly 0.3 -0.9 0.7 -0.2)
```

The drone-do-for command does a command for x second

```clojure
(drone-do-for 4 :take-off) ;=> take off for 4 seconds
(drone-do-for 2 :spin-right 0.8) ;=> spin right at 80% for 2 seconds
(drone-do-for 2 :spin-left 0.3) ;=> spin left at 30% for 2 seconds
```

## To do list
- :flat-trim
- :reset watchdog counter
- incoming data stream

## License

Copyright © 2013 Carin Meier

Distributed under the Eclipse Public License, the same as Clojure.
