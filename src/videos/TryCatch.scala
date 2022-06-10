package videos

object TryCatch {
  // used for error handling
  val str = "123"
  val num = str.toInt

  val str2 = "123a"

  // in try and catch has to be the same return type, otherwise return type will be any
  // e.g.: if you put a println in 'case' it will give Any return type, which is not a good practice
  val num2 = try {
    str2.toInt
  } catch {
    case ex: NumberFormatException => 0
  }

  def main(args: Array[String]): Unit = {
    // happy path - if it can be converted to a number
    println(TryCatch.num)
    // it will run to NumberFormatException - runtime exception, because it was not a valid number
    println(TryCatch.num2)


  }


}
