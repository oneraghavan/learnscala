
object SumProductLength {

  def foldLeft[A, B](as: List[A], z: B)(f: (B, A) => B): B =
    as match {
      case Nil => z
      case x :: xs => foldLeft(xs, f(z, x))(f)
    }

  def main(args: Array[String]) {
    val length: Int = foldLeft(List(1, 2, 3, 4), 0)((x, y) => y)
    val sum: Int = foldLeft(List(1, 2, 3, 4), 0)((x, y) => x + y)
    val product: Int = foldLeft(List(1, 2, 3, 4), 1)((x, y) => x * y)
    println(length)
    println(sum)
    println(product)
  }

}