package com.packt.chapter1.communication

import akka.actor.Actor


class QueryActor extends Actor {
  import Messages._
  override def receive:Receive = {
    case Start(actorRef) =>
      println(s"send me the next random number")
      actorRef ! giveMeRandomNumber

    case Done(x) =>
      println(s"received a random number $x")
  }
}