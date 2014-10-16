import akka.actor._
import com.typesafe.scalalogging.slf4j.StrictLogging

object Main extends StrictLogging {
  class Foo extends Actor {
    def receive = {
      case m =>
    }
  }

  def main(args: Array[String]): Unit = {
    logger.info("Main starts.")

    val system = ActorSystem("sys")

    logger.error("error log test")

    val a1 = system.actorOf(Props[Foo], "foo")
    val a2 = system.actorOf(Props[Foo], "foo") // <- not unique

    system.shutdown
  }
}
