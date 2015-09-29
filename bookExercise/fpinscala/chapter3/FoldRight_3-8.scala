
//not done due to cons.
object Init {

  def foldRight[A,B](as:List[A], z :B )(f : (A,B) => B) : B =
    as match {
      case Nil => z
      case x::xs => f(x, foldRight(xs,z)(f))
    }

  def main(args: Array[String]) {
//    println(foldRight(List(1,2,3), Nil : List[Int]) (x : Int ,y => x + y))
  }

}