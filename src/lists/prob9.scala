
package p9

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
