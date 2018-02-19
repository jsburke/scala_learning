
object patternLen {
  def patternLen[T](xs: List[T]): Int = {
    def lenGuts[T](ys: List[T], count: Int): Int = {
      ys match {
        case e :: es => lenGuts(es, count + 1)
        case Nil => count
      }
    }
    lenGuts(xs, 0) 
  }
}
