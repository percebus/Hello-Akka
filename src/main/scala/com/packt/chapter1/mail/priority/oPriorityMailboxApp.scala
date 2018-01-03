package com.packt.chapter1.mail.priority

import akka.actor.{ActorSystem, Props}

object oPriorityMailboxApp extends App {
  val oActorSystem = ActorSystem("HelloAkka")
  val oMyPriorityActor = oActorSystem.actorOf( Props[MyPriorityActor].withDispatcher("prio-dispatcher") )
      oMyPriorityActor ! 6.0
      oMyPriorityActor ! 1
      oMyPriorityActor ! 5.0
      oMyPriorityActor ! 3
      oMyPriorityActor ! "Hello"
      oMyPriorityActor ! 5
      oMyPriorityActor ! "I am priority actor"
      oMyPriorityActor ! "I process string messages first, then integer, long and others"
}