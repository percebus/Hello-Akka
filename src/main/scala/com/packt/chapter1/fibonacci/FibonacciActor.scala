package com.packt.chapter1.fibonacci

import akka.actor.Actor

class FibonacciActor extends Actor {
  override def receive:Receive = {
    case num:Int =>
      val result = this.getFibonacci(num)
      this.sender ! result
  }

  def getFibonacci(n:Int):Int = n match {
    case 0 | 1 => n
    case _ =>
      this.getFibonacci(n -1) +
      this.getFibonacci(n -2)
  }
}