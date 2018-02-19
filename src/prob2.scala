
import scala.util.Random
import scala.collection.immutable.List._

// second to last element

object Main extends App {
  val xs = (0 to Random.nextInt(42) + 1).toList
  println(xs mkString)
  println(xs.reverse.drop(1).take(1))
}
