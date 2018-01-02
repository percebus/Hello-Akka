package com.packt.chapter1.mail

import java.util.concurrent.ConcurrentLinkedQueue

import akka.actor.ActorRef
import akka.dispatch.{Envelope, MessageQueue}


class MyMessageQueue extends MessageQueue {
  private final val envelopeConcurrentLinkedQueue = new ConcurrentLinkedQueue[Envelope]()

  // these should be implemented; queue used as example
  def enqueue(receiver:ActorRef, envelope:Envelope): Unit = {
    envelope.sender.path.name match {
      case "MyActor" =>
        envelope.sender ! "Hey dude, How are you?, I Know your name,processing your request"
        envelopeConcurrentLinkedQueue.offer(envelope)

      case _ =>
        envelope.sender ! "I don't talk to strangers, I can't process your request"
    }
  }

  def dequeue(): Envelope  =  envelopeConcurrentLinkedQueue.poll
  def numberOfMessages:Int =  envelopeConcurrentLinkedQueue.size
  def hasMessages:Boolean  = !envelopeConcurrentLinkedQueue.isEmpty

  def cleanUp(actorRef:ActorRef, messages:MessageQueue) {
    while (this.hasMessages) {
      messages.enqueue(actorRef, this.dequeue())
    }
  }
}