
object p15 {
  def duplicateN[T](n: Int, xs: List[T]): List[T] = xs flatMap {e => List.fill(n)(e)}
}
