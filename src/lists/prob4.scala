
import scala.util.Random
import scala.collection.immutable.List._

object Main extends App {
  val xs = (0 to Random.nextInt(19) + 1).toList
  print("List is ")
  xs map {case x => print("%d ".format(x))}
  println("\nList is %d elements long".format(xs.length))
}
