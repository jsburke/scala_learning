
object p12 {
  def decode[T](xs: List[(Int, T)]): List[T] = xs flatMap {case (n, v) => List.fill(n)(v)}
}
