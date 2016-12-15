
//not done.
object Length {

  def foldRight[A,B](as:List[A], z :B )(f : (A,B) => B) : B =
    as match {
      case Nil => z
      case x::xs => f(x, foldRight(xs,z)(f))
    }

  def main(args: Array[String]) {
    println(foldRight(List(1,2,3,4,5), 0) ((x,y) => y + 1))
  }

}