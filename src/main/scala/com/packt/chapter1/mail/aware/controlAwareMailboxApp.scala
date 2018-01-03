package com.packt.chapter1.mail.aware

import akka.actor.{ActorSystem, Props}

object controlAwareMailboxApp extends App {
  val oActorSystem = ActorSystem("HelloAkka")
  val oLoggerActor = oActorSystem.actorOf( Props[LoggerActor].withDispatcher("control-aware-dispatcher") )
      oLoggerActor ! "hello"
      oLoggerActor ! "how are"
      oLoggerActor ! "you?"
      oLoggerActor ! MyControlMessage
}