import akka.actor._

object Main {
  import Foo.Err

  def main(args: Array[String]): Unit = {
    val system = ActorSystem("sys")

    val a1 = system.actorOf(Props[Foo], "foo")
    a1 ! Err

    Thread.sleep(1000)

    system.shutdown
  }
}
