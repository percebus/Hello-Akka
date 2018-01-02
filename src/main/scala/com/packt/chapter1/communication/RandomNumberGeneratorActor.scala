package com.packt.chapter1.communication

import akka.actor.Actor
import scala.util.Random._ // nextInt


class RandomNumberGeneratorActor extends Actor {
  override def receive:Receive = {
    case EventTypes.message =>
      println("received a message to generate a random integer")
      val n = nextInt
      this.sender ! EventTypes.Done(n)
    }
}