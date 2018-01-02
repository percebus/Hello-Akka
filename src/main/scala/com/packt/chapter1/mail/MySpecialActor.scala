package com.packt.chapter1.mail

import akka.actor.Actor


class MySpecialActor extends Actor {
  override def receive:Receive = {
    case msg:String => println(s"msg is $msg" )
  }
}