package com.packt.chapter1.stop

import akka.actor.Actor


class StopActor extends Actor {
  override def receive:Receive = {
    case msg:String => println(s"$msg")
    case Stop       => context.stop(self)
  }
}