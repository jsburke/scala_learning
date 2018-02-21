
object p19 {
  def rotate[T](n: Int, xs: List[T]): List[T] = {
    val nWrap = if (n < 0) ((n % xs.length) + xs.length) else n % xs.length
  }
}
