
object Reverse {

  def foldLeft[A,B](as:List[A], z :B )(f : (B,A) => B) : B =
    as match {
      case Nil => z
      case x::xs => foldLeft(xs,f(z,x))(f)
    }

  def main(args: Array[String]) {
    val reverse: List[Int] = foldLeft(List(1, 2, 3, 4), Nil: List[Int])((x, y) => y :: x)
    println(reverse)
  }

}