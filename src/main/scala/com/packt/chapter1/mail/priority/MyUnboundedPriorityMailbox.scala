package com.packt.chapter1.mail.priority

import com.typesafe.config.Config
import akka.actor.ActorSystem
import akka.dispatch.{PriorityGenerator, UnboundedPriorityMailbox}


class MyUnboundedPriorityMailbox(settings:ActorSystem.Settings, config:Config)
  extends UnboundedPriorityMailbox (
    PriorityGenerator {
      case x:String => 0
      case x:Int    => 1
      case x:Long   => 2
      case _        => 3
    }
  )