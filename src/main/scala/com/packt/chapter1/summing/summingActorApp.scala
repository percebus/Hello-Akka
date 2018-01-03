package com.packt.chapter1.summing

import akka.actor.{ActorSystem, Props}


object summingActorApp extends App {
  val oActorSystem = ActorSystem("HelloAkka")

  // creating an actor inside the actor system
  val oSummingActor = oActorSystem.actorOf(Props[SummingActor], "summingActor")
  println(oSummingActor.path)
  // "akka://HelloAkka/user/summingActor"
}