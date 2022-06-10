package videos

object ForLoop {


  def main(args: Array[String]): Unit = {
    // <- is basically 'in'
    for(i <- 1 to 10) {
      println(i)
    }

    for (i <- 1 to 10; if i%3 ==0 || i%5 == 0) {
      println(i)
    }

    for (i <- 1 to 10; if i%3 ==0 || i%5 == 0 ; j <- 'a' to 'c') {
      println(i + " " + j)
    }

    println (" -- * " * 10)
    // you can use curly braces instead of semicolon
    // in order to use 'for' as an expression, use yield (because printing it doesn't really gives back anything)
    val stuff = for {i <- 1 to 10
         if i%3 ==0 || i%5 == 0
         j <- 'a' to 'c'
         } yield {
          i -> j
    }

    println(stuff)




  }

}
