object NamedArguments {
  def main(args: Array[String]): Unit = {
    // When calling methods, you can label the arguments with their parameter names like so:
    def printName(first: String, last: String): Unit = {
      println(first + " " + last)
    }

    printName("John", "Smith")
    printName(first = "John", last = "Smith")
    printName(last = "Smith", first = "John")

    // Notice how the order of named arguments can be rearranged.
    // However, if some arguments are named and others are not, the unnamed arguments must come first and in the order of their parameters in the method signature.


  }

}
