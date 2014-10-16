import akka.actor._
import com.typesafe.scalalogging.slf4j.StrictLogging

object Foo {
  case object Err
}

class Foo extends Actor with StrictLogging {
  import Foo.Err

  def receive = {
    case Err =>
      println("got Err")
      val a1 = context.actorOf(Props[Foo], "foo")
      val a2 = context.actorOf(Props[Foo], "foo") // <- not unique
    case m =>
  }
}

