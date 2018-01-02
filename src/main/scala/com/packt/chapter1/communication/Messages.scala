package com.packt.chapter1.communication

import akka.actor.ActorRef

object Messages {
  case class Done(random:Int)
  case object giveMeRandomNumber
  case class Start(oActorRef:ActorRef)
}
