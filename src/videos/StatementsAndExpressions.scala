package videos

object StatementsAndExpressions {
  // statement is valid code that you can put in, that tells the language to do sg but it doesn't produce a value
  // expression is something that produces a value

  val value = 42
  val age = 31

  // + is the part of the library
  value+age
  value.+(age)

  value.min(age)




  def main(args: Array[String]): Unit = {
   println(StatementsAndExpressions.value.min(age))
   println(StatementsAndExpressions.value == StatementsAndExpressions.age )

  }

}
