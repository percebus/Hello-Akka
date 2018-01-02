package com.packt.chapter1.summing.param

import akka.actor.Actor


/**
  * SRC https://www.packtpub.com/mapt/book/all_books/9781785288180/1/ch01lvl1sec11/defining-the-actor%2527s-behavior-and-state
  */
class ParamSummingActor(intitalSum:Int) extends Actor {
  var sum = 0 // state inside the actor

  override def receive: Receive = {
    case x:Int => // receives message an integer
      sum = intitalSum + sum + x
      println(s"my state as sum is $sum")

    case _ => // receives default message
      println("I don't know what are you talking about")
  }
}