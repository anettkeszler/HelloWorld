package videos

object StringInterpolation {

  val name: String = "Anett Keszler"
  val age: Int = 31

  val t = (1, 2.7, "hi there")

  val message = name + " is " + " years old."

  // use case for string interpolation
  val message2 = s"$name is ${age+1} years old."
  // if we have a more complex expression we can put it inside of curly braces
  val str = s"The second element of th is ${t._2} "


  def main(args: Array[String]): Unit = {
    println(StringInterpolation.message2)

  }

}
