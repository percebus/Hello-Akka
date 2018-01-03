import akka.actor.{ActorSystem, Props}
import com.packt.chapter1.mail.{MyActor, MySpecialActor}

object customMailboxApp extends App  {
  val oActorSystem = ActorSystem("HelloAkka")
  val oMySpecialActor = oActorSystem.actorOf( Props[MySpecialActor].withDispatcher("custom-dispatcher") )

  // "I don't talk to strangers, I can't process your request"
  val unknownMyActor  = oActorSystem.actorOf(Props[MyActor], "xyz")

  //Hey dude, How are you?, I Know your name,processing your request
  val trustedMyActor  = oActorSystem.actorOf(Props[MyActor], "MyActor")

  unknownMyActor ! ("sneaky", oMySpecialActor)
  trustedMyActor ! ("hello!", oMySpecialActor) // "msg is hello!"
}