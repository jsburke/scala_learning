
import scala.collection.immutable.List._

object Main extends App {
  val n  = 7
  val xs = (1 to 42).toList
  println("The %dth element in xs is %d".format(n, xs(n)))
}
