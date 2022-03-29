object Tuples {
  def main(args: Array[String]): Unit = {
    // tuple is a value that contains a fixed number of elements, each with its own type.
    // tuples are immutable
    // tuples are especially handy for returning multiple values from a method
    val ingredient = ("Sugar", 25)
    // This creates a tuple containing a String element and an Int element.
    // The inferred type of 'ingredient' is (String, Int), which is shorthand for Tuple2[String, Int].
    // To represent tuples, Scala uses a series of classes: Tuple2, Tuple3, etc., through Tuple22. Each class has as many type parameters as it has elements.

    // 1. ACCESSING THE ELEMENTS
    // by position
    println(ingredient._1) // Sugar
    println(ingredient._2) // 25

    // 2. PATTERN MATCHING ON TUPLES
    // A tuple can also be taken apart using pattern matching:
    val (name, quantity) = ingredient
    println(name) // Sugar
    println(quantity) // 25

    // Here is another example of pattern-matching a tuple:
    val planets =
      List(("Mercury", 58.9), ("Venus", 108.2), ("Earth", 149.6), ("Mars", 227.9), ("Jupiter", 778.3))

    planets.foreach{
      case ("Earth", distance) =>
        println(s"Our planet is $distance million kilometers from the sun")
      case _ =>
    }

    // Or, in 'for' comprehension:
    val numPairs = List((2, 5), (3, -7), (20, 56))
    for ((a, b) <- numPairs) {
      println(a*b)
    }

    // 3. TUPLES AND CASE CLASSES
    // Users may sometimes find it hard to choose between tuples and case classes. Case classes have named elements. The names can improve the readability of some kinds of code.
    // In the planet example above, we might define case class Planet(name: String, distance: Double) rather than using tuples.
  }
}
