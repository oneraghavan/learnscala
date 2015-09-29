
object FoldLeft {

  def foldLeft[A,B](as:List[A], z :B )(f : (B,A) => B) : B =
    as match {
      case Nil => z
      case x::xs => foldLeft(xs,f(z,x))(f)
    }

  def main(args: Array[String]) {
    println(foldLeft(List(1,2,3,4), 0) ((x,y) => y))
  }

}