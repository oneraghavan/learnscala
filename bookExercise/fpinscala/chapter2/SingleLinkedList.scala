sealed trait List[+A]

case object Nil extends List[Nothing]

case class Cons[+A](head: A, tail: List[A]) extends List[A]

object List {
  def sum(list: List[Int]): Int = {
    list match {
      case Nil => 0
      case Cons(x, xs) => x + sum(xs)
    }
  }

  def product(list: List[Int]): Int = {
    list match {
      case Nil => 0
      case Cons(0.0, _) => 0
      case Cons(x, xs) => x + sum(xs)
    }
  }

  def apply[A](as: A*): List[A] = {
    if (as.isEmpty) Nil
    else Cons(as.head, apply(as.tail: _*))
  }
}

