
import scala.util.Random
import scala.collection.immutable.List._

// get last item in list

object Main extends App {
  val xs = (0 to Random.nextInt(42) + 1).toList 
  xs map {n => print(n + "  ")}
  println("\nThe Last value is " + xs.last.toString)
}
