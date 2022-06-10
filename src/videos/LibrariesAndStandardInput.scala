package videos

import scala.io.StdIn._

object LibrariesAndStandardInput {

  // packages
  // scala.io.StdIn._ --> contains a lot of methods for user input
  def main(args: Array[String]): Unit = {
    println("What is your name?")
    val name = readLine()
    println("How old are you?")
    val age = readInt()

  }

}
