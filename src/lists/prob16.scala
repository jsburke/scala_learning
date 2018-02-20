
object p16 {
  def dropN[T](n: Int, xs: List[T]): List[T] = xs.zipWithIndex filter {case(e,i) => ((i + 1 ) % n) != 0} map {_._1}
}
