
object FoldLeft {

  def foldRight[A,B](as:List[A], z :B )(f : (A,B) => B) : B =
    as match {
      case Nil => z
      case x::xs => f(x, foldRight(xs,z)(f))
    }

  def main(args: Array[String]) {
    println(foldRight(List(1,2,3,4), Nil : List[Int]) ((x,y) => (x + 1) :: y))
  }

}