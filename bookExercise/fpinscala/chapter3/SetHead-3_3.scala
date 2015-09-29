
object SetHead {

  def sethead[A](as : List[A],a : A) : List[A] = {
    as match {
      case Nil => a :: Nil
      case x::xs => a :: xs
    }
  }

  def main(args: Array[String]) {
    println(sethead(List(1,2,3),4))
    println(sethead(Nil,4))
    println(sethead(Nil,Nil))
  }

}