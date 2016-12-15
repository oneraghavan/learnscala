sealed trait MyList[+A]

case object MyNil extends MyList[Nothing]

case class Cons[+A](head: A, tail: MyList[A]) extends MyList[A]

object MyList {
  def sum(list: MyList[Int]): Int = {
    list match {
      case MyNil => 0
      case Cons(x, xs) => x + sum(xs)
    }
  }

  def product(list: MyList[Int]): Int = {
    list match {
      case MyNil => 0
      case Cons(0.0, _) => 0
      case Cons(x, xs) => x + sum(xs)
    }
  }

  def apply[A](as: A*): MyList[A] = {
    if (as.isEmpty) MyNil
    else Cons(as.head, apply(as.tail: _*))
  }
}

