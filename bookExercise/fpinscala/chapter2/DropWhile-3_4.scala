
object DropWhile {

  def tail[A](as : List[A]) : List[A] = {
    as match {
      case Nil => Nil
      case x::xs => xs
    }
  }

  def dropwhile[A](l : List[A],f : A => Boolean) : List[A] ={
    l match {
      case Nil => l
      case x :: xs => {
        f(x) match {
          case true => xs
          case false => l
        }
      }
    }
  }

  def main(args: Array[String]) {
    println(dropwhile(List(1,2,3,4,5,6), (x : Int) => x.equals(2)))
    println(dropwhile(List(2,1,3,4,5,6), (x : Int)=> x.equals(2)))
  }

}