
object p14 {
  def duplicate[T](xs: List[T]): List[T] = xs flatMap {e => List(e, e)}
}
