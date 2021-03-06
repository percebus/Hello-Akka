package com.packt.chapter1.comm

import akka.actor.{ActorSystem, Props}

object communicationApp extends App {
  import EventTypes._

  val oActorSystem = ActorSystem("HelloAkka")
  val randomNumberGenerator = oActorSystem.actorOf(
        Props[RandomNumberGeneratorActor],
        "randomNumberGeneratorActor")

  val oQueryActor = oActorSystem.actorOf(
        Props[QueryActor],
        "queryActor")

  /**
    Prints the following
      send me the next random number
      received a message to generate a random integer
      received a random number 841431704
    */
  oQueryActor ! Start(randomNumberGenerator)
}