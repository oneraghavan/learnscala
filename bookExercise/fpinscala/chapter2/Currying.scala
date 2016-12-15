
/**
  * Created by Indix on 14/12/16.
  */object Currying {

  def curry[A, B, C](f: (A, B) => C): A => (B => C) =
    a => (b => f(a, b))

}