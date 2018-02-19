
import scala.util.Random
import scala.collection.immutable.List._

object Main extends App {
  def printMap(ys: List[Int]): Unit = ys map {case y => print("%d ".format(y))}
  def isPalin(xs: List[Any]): Boolean = ((xs zip xs.reverse map {case (a,b) => a == b}) foldLeft true)(_ && _)
 

  val xs = (0 to Random.nextInt(19) + 1).toList
  print("List is ")
  printMap(xs) 
  if (isPalin(xs)) println("\nxs is a palindrome") else println("\nxs is not a Palindrome")

  val ys = List(1,2,3,2,1)
  print("List is ")
  printMap(ys)
  if (isPalin(ys)) println("\nys is a palindrome") else println("\nys is not a Palindrome")
  
}
