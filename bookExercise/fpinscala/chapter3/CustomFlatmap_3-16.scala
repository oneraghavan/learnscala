
object flatmap {

  def foldRight[A, B](as: List[A], z: B)(f: (A, B) => B): B =
    as match {
      case Nil => z
      case x :: xs => f(x, foldRight(xs, z)(f))
    }

  def main(args: Array[String]) {
    println(flatmap(List(1, 2, 3, 4))((x: Int) => List("a","b")))
  }

  def flatmap[A, B](as: List[A])(f: A => List[B]): List[B] = {
    foldRight(as, Nil: List[B])((x, y) => foldRight(f(x), y)((m, n) => m :: n))
  }
}