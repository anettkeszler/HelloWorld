package videos

import scala.math.BigDecimal.double2bigDecimal

object ArraysAndLists {

  // one of the most important components of a standard library is the collections
  // they are located in scala.collection package
  def main(args: Array[String]): Unit = {

    val marks = Array(97, 100, 69, 78, 40, 50, 99)
    println("Array elements are : ")
    for(i <- 0 to marks.length-1 )
      print(marks(i) + " ")


    marks.foreach(println)


    val list = List(1, 2, 5, 8, 34)
    val list2 = List('a', 'b', 'c')

    // you can index both

    println(list(3)) // 8
    println(marks(3)) // 78

    // main difference between array and list is mutability - the array is mutable, and the list is not
    // I can reassign a value in an array, but can't in a list - immutable

   //  list(3) = 99  this will not compile
    marks(3) = 99

    // size: when we assign an array we cannot change the size
    // but with list we can add values very efficiently add a new element to the front of the list

    val list3 = 'd' :: list2
    list3.foreach(println)


    // fill and tabulate methods -
    // fill - use this to fill a list or an array with values
    val arr = Array.fill(10)(0)

    val list4 = List.fill(10)(Math.random())

    val list5 = List.fill(5)(io.StdIn.readLine())
    list5.foreach(println)

    // tabulate
    // the fill doesn't provide any information about where we are, no information about index --> in this case we use tabulate

    val arr2 = Array.tabulate(10)(i => i*i)
    arr2.foreach(println)

    // this synthax is available to make larger lists, but not recommended
    // it will give a nullpointer exception in case of arrayString Array(null, null, null, null)...

    val list6 = new Array[Int](10)

    // range
    for (i <- 1 to 10) {
      println(i) // 1-10
    }

    for (i <- 1 until 10) {
      println(i) // 1-9 --> until is exclusive
    }

    for(i <- 'a' to 'z') {
      print(i)
    }

    for(i <- 1 to 10 by 2) {
      print(i)
    }

    for(i <- 'a' to 'z' by 3) {
      print(i)
    }

    // for doubles it works only if you use 'by'
    for(i <- 1.0 to 10.0 by 1.0) {
      print(i)
    }
  }







}
