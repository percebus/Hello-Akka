package com.packt.chapter1

import akka.actor.ActorSystem

/**
  * SRC: https://www.packtpub.com/mapt/book/Application%20Development/9781785288180/1/ch01lvl1sec10/creating-and-understanding-actorsystem
  */
object HelloAkkaApp extends App {
  val oActorSystem = ActorSystem("HelloAkka")
  println(oActorSystem)// "akka://HelloAkka"
}