package videos

object DeclarationsAndScope {
  // Declarations
  // var and val - we use to declare variables
  // def is used to declare methods
  // object - we can declare types with class and trait
  // a declaration (e.g. a variable) only exists from the point of declaration until the end of the curly braces that it appears inside of
  // you cannot print a variable in line 10 which was declared in line 19

  // argument can be used inside the function or method
  def main(args: Array[String]): Unit = {
    println(args)

    val thing = {
      val thing2 = 43
      println("in the block")
      thing2
    }

    println(thing)

  }

}
