package videos

object IfAndWhile {
  def main(args: Array[String]): Unit = {

    // it takes a conditional statement, it has to be a boolean

    var i = 0
    while (i < 10) {
      println(i)
      i+= 1 // i = i + 1
    }

    var age = 19
    if (age < 18) {
      println("No admittance.")
    } else {
      println("Come on in.")
    }

    // you can store the result of the expression in a value.
    val response = if (age < 18) {
      "No admittance."
    } else {
      "Come on in."
    }

    println(response)
    // or
    println(if(age < 18) "No admittance." else "Come on in.")






  }

}
