
object p18 {
  def extract[T](start: Int, end: Int, xs: List[T]): List[T] = xs.drop(start).take(end-start)
}
