package com.packt.chapter1.stop

import akka.actor.Actor


class StoppingActor extends Actor {
  override def receive:Receive = {
    case msg:String => println(s"$msg")
    case Stop       => context.stop(self)
  }
}