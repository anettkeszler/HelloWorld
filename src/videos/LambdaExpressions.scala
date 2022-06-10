package videos


object LambdaExpressions {

  // a short literal expression that defines a function

  // this is a method of the object, it's not a function
  def square(x: Double): Double = x*x

  // this is a function
  val square2 = (x: Double) => x*x
  val square3: Double => Double = x => x*x
  // you can shorten the above function like this:
  val square4: Double => Double = _ * 2


  val lessThan: (Double, Double) => Boolean = (x, y) => x < y
  val lessThan2: (Double, Double) => Boolean = _ < _

  // underscore syntax


  def main(args: Array[String]): Unit = {
    println(LambdaExpressions.square2(23))

  }

}
