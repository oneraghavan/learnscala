
object Drop {

  def tail[A](as : List[A]) : List[A] = {
    as match {
      case Nil => Nil
      case x::xs => xs
    }
  }

  def drop[A](l : List[A],n : Int) : List[A] ={
    n match {
      case 0 => l
      case _ => drop(tail(l),n-1)
    }
  }

  def main(args: Array[String]) {
    println(drop(List(1,2,3,4,5,6),2))
    println(drop(List(1,2,3,4,5,6),0))
    println(drop(Nil,1))
    println(drop(Nil,0))
  }

}