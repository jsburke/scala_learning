
import scala.collection.immutable.List._

object Main extends App {
  def printMap(ys: List[Int]): Unit = ys map {case y => print("%d ".format(y))}

  val xs = List(1,1,2,3,4,4,4)
  print("List: ")
  printMap(xs)
  print("\nTrim duplicated elements:")  
  printMap(xs.distinct)
  print("\n")
}
