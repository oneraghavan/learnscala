
object Filter {

  def foldRight[A, B](as: List[A], z: B)(f: (A, B) => B): B =
    as match {
      case Nil => z
      case x :: xs => f(x, foldRight(xs, z)(f))
    }

  def main(args: Array[String]) {
    println(filter(List(1, 2, 3, 4))((x: Int) => x > 2))
  }

  def filter[A, B](as: List[A])(f: A => Boolean): List[A] = {
    foldRight(as, Nil: List[A])((x, y) => {
      if (f(x)) x :: y else y})
  }

}