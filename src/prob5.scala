
import scala.util.Random
import scala.collection.immutable.List._

object Main extends App {
  def printMap(ys: List[Int]): Unit = ys map {case y => print("%d ".format(y))}

  val xs = (0 to Random.nextInt(19) + 1).toList
  print("List is ")
  printMap(xs) 
  print("\nReversed: ")
  printMap(xs.reverse) 
}
