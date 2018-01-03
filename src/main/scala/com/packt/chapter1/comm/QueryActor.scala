package com.packt.chapter1.comm

import akka.actor.Actor


class QueryActor extends Actor {

  override def receive:Receive = {
    case EventTypes.Start(oActorRef) =>
      println(s"send me the next random number")
      oActorRef ! EventTypes.message

    case EventTypes.Done(x) =>
      println(s"received a random number $x")
  }
}