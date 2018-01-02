package com.packt.chapter1.fibonacci

import akka.actor.Actor

class FibonacciActor extends Actor {
  override def receive:Receive = {
    case num:Int =>
      val result = getFibonacci(num)
      sender ! result
  }

  def getFibonacci(n:Int):Int = n match {
    case 0 | 1 => n
    case _ =>
      getFibonacci(n -1) +
      getFibonacci(n -2)
  }
}