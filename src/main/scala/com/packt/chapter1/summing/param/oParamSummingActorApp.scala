package com.packt.chapter1.summing.param

import akka.actor.{ActorSystem, Props}


object oParamSummingActorApp extends App {
  val oActorSystem = ActorSystem("HelloAkka")

  // creating an actor inside the actor system
  val oParamSummingActor = oActorSystem.actorOf(
        Props(classOf[ParamSummingActor], 10),
        "paramSummingActor")

  println(oParamSummingActor.path)
  // "akka://HelloAkka/user/paramSummingActor"
}