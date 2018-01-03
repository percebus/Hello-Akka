package com.packt.chapter1.become

import akka.actor.{ActorSystem, Props}


object becomeApp extends App {
  val oActorSystem = ActorSystem("HelloAkka")
  val oBecomeActor = oActorSystem.actorOf(Props[BecomeActor])
  var isString = true
  oBecomeActor ! isString
  oBecomeActor ! "Hello how are you?"

  isString = false
  oBecomeActor ! isString
  oBecomeActor ! 1100

  isString = true
  oBecomeActor ! isString
  oBecomeActor ! "What do u do?"
}