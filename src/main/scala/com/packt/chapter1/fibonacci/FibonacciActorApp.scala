package com.packt.chapter1.fibonacci

import akka.actor.{ActorSystem, Props}
import akka.pattern.ask // '?'
import akka.util.Timeout
import scala.concurrent.Await
import scala.concurrent.duration._ // 'seconds'


object FibonacciActorApp extends App {
  implicit val oTimeout = Timeout(10 seconds)
  val oActorSystem = ActorSystem("HelloAkka")
  val oFibonacciActor = oActorSystem.actorOf(Props[FibonacciActor])

  // asking for result from actor
  val n = 9
  val oFuture = (oFibonacciActor? n).mapTo[Int]
  val x = Await.result(oFuture, 10 seconds)
  println(x)
}