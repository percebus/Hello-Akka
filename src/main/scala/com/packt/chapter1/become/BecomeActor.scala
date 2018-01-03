package com.packt.chapter1.become

import akka.actor.Actor


/* FIXME
 * Why 'isStateTrue' also invoking 'context.become'?
 * Is it behaving like a toggle?
 */
class BecomeActor extends Actor {

  def processString:Receive = {
    case msg:String => println(s"$msg")
    case false      => context.become(this.processInt)
  }

  def processInt:Receive = {
    case msg:Int => println(s"$msg")
    case true    => context.become(this.processString)
  }


  def receive:Receive = {
    case true  => context.become(this.processString)
    case false => context.become(this.processInt)
    case _     => println("don't know what you want to say !! ")
  }
}