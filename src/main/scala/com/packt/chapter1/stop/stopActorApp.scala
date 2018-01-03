package com.packt.chapter1.stop

import akka.actor.{ActorSystem, PoisonPill, Props}


object stopActorApp extends App{
  val oActorSystem = ActorSystem("HelloAkka")

  // externally killing it
  val someStopActor = oActorSystem.actorOf(Props[StopActor], "someStopActor")
      someStopActor ! "hello"
      someStopActor ! PoisonPill
      someStopActor ! "Are you there?" // nothing!

  // internally self stops
  val otherStopActor = oActorSystem.actorOf(Props[StopActor], "otherStopActor")
      otherStopActor ! "hello"
      otherStopActor ! Stop
      otherStopActor ! "Are you there?" // nothing!
}