package com.packt.chapter1.fibonacci

import akka.actor.Actor

class FibonacciActor extends Actor {
  override def receive:Receive = {
    case num:Int =>
      val result = fib(num)
      sender ! result
  }

  def fib(n:Int):Int = n match {
    case 0 | 1 => n
    case _ => fib(n -1) + fib(n -2)
  }
}