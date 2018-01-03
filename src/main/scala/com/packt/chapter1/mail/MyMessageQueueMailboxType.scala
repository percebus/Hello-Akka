package com.packt.chapter1.mail

import com.typesafe.config.Config
import akka.actor.{ActorRef, ActorSystem}
import akka.dispatch.{MailboxType, MessageQueue, ProducesMessageQueue}


class MyMessageQueueMailboxType extends MailboxType with ProducesMessageQueue[MyMessageQueue] {

  def this(settings:ActorSystem.Settings, config:Config) = { this() }


  // The create method is called to create the MessageQueue
  final override def create(owner:Option[ActorRef], system:Option[ActorSystem]):MessageQueue = new MyMessageQueue()
}