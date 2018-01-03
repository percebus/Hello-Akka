package com.packt.chapter1.stop

import akka.actor.{ActorSystem, PoisonPill, Props}


object stopActorApp extends App{
  val oActorSystem = ActorSystem("HelloAkka")

  // externally killing it
  val someStoppingActor = oActorSystem.actorOf(Props[StoppingActor], "someStopActor")
      someStoppingActor ! "hello"
      someStoppingActor ! PoisonPill
      someStoppingActor ! "Are you there?" // nothing!

  // internally self stops
  val otherStoppingActor = oActorSystem.actorOf(Props[StoppingActor], "otherStopActor")
      otherStoppingActor ! "hello"
      otherStoppingActor ! Stop
      otherStoppingActor ! "Are you there?" // nothing!
}