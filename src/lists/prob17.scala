
object p17 {
  def splitN[T](n: Int, xs: List[T]): (List[T], List[T]) = (xs.take(n), xs.drop(n))
}
