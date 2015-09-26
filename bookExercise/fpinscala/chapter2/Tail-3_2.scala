
object Tail {

  def tail[A](as : List[A]) : List[A] = {
    as match {
      case Nil => Nil
      case x::xs => xs
    }
  }

  def main(args: Array[String]) {
    println(tail(List(1,2,3)))
    println(tail(Nil))
  }

}