
object isSorted {

  def main(args: Array[String]) {

    def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
      val length: Int = as.length
      length match {
        case 1 => true
        case n => ordered(as(n - 2), as(n - 1)) && isSorted(as.slice(0, n - 1), ordered)
      }

    }
    println(isSorted(Array(1, 2, 3, 4, 5), (x: Int, y: Int) => x < y))
  }

}