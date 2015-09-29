
object FoldLeft {

  def foldRight[A, B](as: List[A], z: B)(f: (A, B) => B): B =
    as match {
      case Nil => z
      case x :: xs => f(x, foldRight(xs, z)(f))
    }

  def main(args: Array[String]) {
    println(map(List(1, 2, 3, 4))((x: Int) => x * 2))
  }

  def map[A, B](as: List[A])(f: A => B): List[B] = {
    foldRight(as, Nil: List[B])((x, y) => f(x) :: y)
  }

}