package videos

object MatchExpression {
  // match expression is powerful in pattern matching

  val name = "Anett"
  val fizzbuzz = for (i <- 1 to 20) yield {
    (i%3, i%5) match {
      case (0,0) => "fizzbuzz"
      case (0, _) => "fizz"
      case (_, 0) => "buzz"
      case _ => i.toString // important to convert it to toString, because it returns Any if not converted
      // (if 3 cases returns String and 1 returns int, the return value type will be Any )
      // you get a more useful collection
    }

  }

  def main(args: Array[String]): Unit = {
    println(MatchExpression.fizzbuzz)

  }

}
