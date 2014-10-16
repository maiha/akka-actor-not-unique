import akka.actor._

import com.typesafe.scalalogging.slf4j.StrictLogging

object Main extends StrictLogging {
  import Foo.Err

  def main(args: Array[String]): Unit = {
    val system = ActorSystem("sys")

    logger.info("a test to write log")

    val a1 = system.actorOf(Props[Foo], "foo")
    a1 ! Err

    Thread.sleep(1000)

    system.shutdown
  }
}
