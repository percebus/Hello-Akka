package com.packt.chapter1.communication

import akka.actor.{ActorSystem, Props}

object oCommunicationApp extends App {
  import Messages._

  val oActorSystem = ActorSystem("HelloAkka")
  val randomNumberGenerator = oActorSystem.actorOf(
        Props[RandomNumberGeneratorActor],
        "randomNumberGeneratorActor")

  val oQueryActor = oActorSystem.actorOf(
        Props[QueryActor],
        "queryActor")

  oQueryActor ! Start(randomNumberGenerator)
}