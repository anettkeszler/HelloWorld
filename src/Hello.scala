
object Hello {
  println("hello Netti, good to have you here.")

  println(scala.math.BigDecimal)
  println(true || false)

  def main(args: Array[String]): Unit = {
    // Basics

    // 1.EXPRESSIONS
    println(1+3)
    println("Hello")
    println("Hello," + " world!")

    // 1.1. Values - name the results of expressions using the 'val' keyword
    val a = 1 + 1
    println(a)
    // values cannot be re-assigned
    //a = 4 - this doesn't compile
    //the type of a value van be omitted and inferred, or it can be explicitly stated
    val b: Int = 1 + 4

    //1.2. Variables - are like values, except you can re-assign them
    var c = 2+3
    c = 3 // this compiles
    println(c*c) // 9
    // as with values, the type can be omitted and inferred or explicitly stated
    var d: Int = 7

    // 2. BLOCKS
    // you can combine expressions by surrounding them with {} (curly braces). We call this a block.
    // the result of the last expression in the block is the result of the overall block, too:
    println({
      val e = 1 + 1
      e + 1
    }) // 3

    // 3. FUNCTIONS
    // functions are expressions that have parameters, and take arguments

    // anonymous function - no name
    //(f: Int) => f + 1 // it returns a given integer plus 1
      // left side of the => is the list of parameters. On the right is an expression involving the parameters

    // one parameter
    val addOne = (g: Int) => g + 1
    println(addOne(3)) // 4
    // multiple parameters
    val add = (x: Int, y: Int) => x + y
    println(add(5, 6)) // 11
    // no parameter
    val getTheAnswer = () => 45
    println(getTheAnswer()) // 45

    // 4. METHODS
    // Methods look and behave very similar to functions, but there are a few key differences between them.
    //Methods are defined with the def keyword. def is followed by a name, parameter list(s), a return type, and a body:
    def add2(x: Int, y: Int): Int = x + y
    println(add2(4, 8)) // 12
    // Notice how the return type Int is declared after the parameter list

    // A method can take multiple parameter lists:
    def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier
    println(addThenMultiply(2, 3)(5)) // 25

    // Or no parameter lists at all:
    def name: String = System.getProperty("user.name")
    println("Hello, " + name + "!")

    // methods can have multi-line expressions as well:
    def getSquareString(input: Double): String = {
      val square = input * input
      square.toString
    }
    println(getSquareString(2.5)) // "6.25"
    // the last expression in the body is the method's return value (scala has a 'return' but it is rarely used)

    // 5. CLASSES
    // you can define classes with the class keyword, followed by its name and constructor parameters:
    class Greeter (prefix: String, suffix: String) {
      def greet(name: String): Unit =
        println(prefix + name + suffix)
    }

    // Unit return type signifies that there is nothing meaningful to return - void in Java
    val greeter = new Greeter("Hello, " , "!")
    greeter.greet("Scala developer") // Hello, Scala developer!

    // 6. CASE CLASSES
    // By default, instances of case classes are immutable, and they are compared by value (unlike classes, whose instances are compared by reference).
    // This makes them additionally useful for pattern matching.

    case class Point(x: Int, y: Int)
    // you can instantiate case classes without the new keyword:
    val point = Point(1, 2)
    val anotherPoint = Point(1, 2)
    val yetAnotherPoint = Point(2,2)

    // instances of case classes are compared by value, not by reference:
    if (point == anotherPoint) {
      println(s"$point and $anotherPoint are the same.")
    } else {
      println(s"$point and $anotherPoint are different.")
    } // Point(1,2) and Point(1,2) are the same.

    if (point == yetAnotherPoint) {
      println(s"$point and $yetAnotherPoint are the same.")
    } else {
      println(s"$point and $yetAnotherPoint are different.")
    } // Point(1,2) and Point(2,2) are different.

    // 7. OBJECTS
    // Objects are single instances of their own definitions. - singletons of their own classes
    object IdFactory {
      private var counter = 0

      def create(): Int = {
        counter+=1
        counter
      }
    }
    // you can access an object by referring to its name:
    val newId: Int = IdFactory.create()
    println(newId) // 1
    val newerId: Int = IdFactory.create()
    println(newerId) // 2

    // 8. TRAITS
    // Traits are abstract data types containing certain fields and methods.
    // In Scala inheritance, a class can only extend one other class, but it can extend multiple traits.
    trait GreeterTrait {
      def greet(name: String): Unit
    }
    // Traits can also have default implementations:
    trait GreeterTrait2 {
      def greet(name: String): Unit =
        println("Hello, " + name + "!")
    }
    // you can extend traits with the extend keyword and override an implementation with the override keyword:
    class DefaultGreeter extends GreeterTrait2 {
    }

    val greeter2 = new DefaultGreeter()
    greeter2.greet("Scala developer")


    class CustomizableGreeter(prefix: String, postfix: String) extends GreeterTrait2 {
      override def greet(name: String): Unit = {
        println(prefix + name + postfix)
      }
    }

    val customGreeter = new CustomizableGreeter("How are you, ", "?")
    customGreeter.greet("Anett")

    // 9. Main method
    // The main method is the entry point of a Scala program. The JVM requires a main method, named main, that takes one argument: an array of Strings


    // 10. PRACTICE
    var i = 0
    while(i <= 10) {
      println(i)
      i+=1
    }

    // use do-while to guarantee that you're going to go through the loop at least once
    do {
      println(i)
      i+1
    }while (i<=10)

    for (i <- 1 to 10)
      println(i)

    val randomLetters = "ABCDEFGH"

    for (i <- 0 until randomLetters.length)
      println(randomLetters(i))

    val aList = List(1, 2, 3, 4, 5)
    for (i <- aList) {
      println("List items " + i)
    }
  }




}
