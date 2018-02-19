
object p9 {
  def pack[T](xs: List[T]): List[List[T]] = {

    def packGuts[T](ys: List[T], acc: List[List[T]]): List[List[T]] = {
      ys match{
        case Nil => acc  //base case
        case _   => {val (dup: List[T], left: List[T]) = ys.span( _ == ys.head)
                     packGuts(left, acc:::List(dup))
                    }
      }
    }
    packGuts(xs, List())
  }
}


object p11 {

  def decode[T](xs: List[T]): List[Any] = {
    p9.pack(xs) map {x => if (x.length == 1) x.head else (x.length, x.head)}
  }
}

