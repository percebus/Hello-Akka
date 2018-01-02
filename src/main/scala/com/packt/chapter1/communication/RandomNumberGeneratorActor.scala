package com.packt.chapter1.communication

import akka.actor.Actor
import scala.util.Random._ // nextInt


class RandomNumberGeneratorActor extends Actor {
  import Messages._

  override def receive:Receive = {
    case giveMeRandomNumber =>
      println("received a message to generate a random integer")
      val n = nextInt
      sender ! Done(n)
    }
}