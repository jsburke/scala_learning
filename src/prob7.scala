
import scala.collection.immutable.List._

object Main extends App {
  def printFlat(xs: List[List[Any]]): Unit = xs.flatten map (x => print("%d ".format(x))) 

  val xs = List(List(1,3), List(3,4))
  println("Flatten to ")
  printFlat(xs)
  print("\n")
}
