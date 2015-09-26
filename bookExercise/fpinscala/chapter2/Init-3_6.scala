
object Init {

  def init[A](as : List[A]) : List[A] = {
    as.length match {
      case 0 => Nil
      case 1 => Nil
      case _ => as.head :: init(as.tail)
    }
  }

  def main(args: Array[String]) {
    println(init(List(1,2,3,4)))
    println(init(List(1)))
    println(init(Nil))
  }

}