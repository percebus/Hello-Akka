package com.packt.chapter1.mail.aware

import akka.actor.Actor

class LoggerActor extends Actor {
  def receive = {
    case oMyControlMessage => println("Oh, I have to process Control message first")
    case x                 => println(x.toString)
  }
}