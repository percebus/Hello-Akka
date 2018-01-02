package com.packt.chapter1.communication

import akka.actor.ActorRef

object EventTypes {
  case class Start(actorRef:ActorRef)
  case object message
  case class Done(random:Int)
}