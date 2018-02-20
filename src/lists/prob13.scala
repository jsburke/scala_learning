
object p13 {
  def encodeDirect[T](xs: List[T]): List[(Int, T)] = {
    xs match {
      case Nil => Nil
      case _   => { val (pack, rem) = xs.span(_ == xs.head)
                    (pack.length, pack.head) :: encodeDirect(rem) 
                  }
    }
  }
}

