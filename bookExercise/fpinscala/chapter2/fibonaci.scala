package fpinscala.chapter2

object fibonaci {

  def main(args: Array[String]) {
    @annotation.tailrec
    def fibonaci(num: Int, a: Int, b: Int): Int = {
      num match {
        case 0 => a
        case 1 => b
        case _ => fibonaci(num - 1, b, a + b)
      }
    }

    println(fibonaci(6,0,1).toString)
  }

}