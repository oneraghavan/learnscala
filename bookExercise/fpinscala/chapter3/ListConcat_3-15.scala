
object ListConcat {

  def foldRight[A, B](as: List[A], z: B)(f: (A, B) => B): B =
    as match {
      case Nil => z
      case x :: xs => f(x, foldRight(xs, z)(f))
    }

  def main(args: Array[String]) {
    val joinList = (xs: List[Int], ys: List[Int]) => {
      foldRight (xs, ys) ((z: Int, zs: List[Int] ) => z :: zs)
    }
    println(foldRight(List(List(1, 2, 3), List(1, 2, 3), List(1, 2, 3)), Nil: List[Int]) (joinList) )
  }

}