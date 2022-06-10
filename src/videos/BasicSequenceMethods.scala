package videos

object BasicSequenceMethods {
  // immutability: you cannot change the original sequence/collection, if you call a method on it (drop, take...) it will create
  // a completely new collection and won't change the original one

  val a = Array(9, 6, 2, 5, 8, 4, 1)
  println(a.length)
  // drop(n) method: n is the number of elements to be dropped from the stated sequence from the beginning of the list
  val b = a.drop(3)
  println(b.length)

  // dropRight(n)
  val c = a.dropRight(2)
  println(c.size)

  // head: to get the first element from a list
  println(a.head) // 9

  // tail: to get everything but the first element
  println(a.tail.size) // 6

  // last: get the last element
  println(a.last) // 1

  // splitAt - it gives back a tuple of 2 arrays where it splits on the index that I give it
  val d, e = a.splitAt(3)

  println(d._1.length, e._2.size)

  // take(n) - if you want to get the first n element
  val f = a.take(3) // 9, 6, 2
  // takeRight(n) - to get the last n element
  val g = a.takeRight(3) // 8, 4, 1

  // slice(n, m) - it takes 2 arguments, a beginning and an ending index, the second argument to slice is an exclusive bounce
  val h = a.slice(2, 5) // 2, 5, 8

  // patch(n) - patch takes an index where you want to begin patching, it will going to replace some segment of your collection
  val i = a.patch(3, Array(96, 96, 99), 2)

  // diff - it will remove the given numbers from the array
  val j = a.diff(Array(1, 2, 4))

  // distinct
  val k = Array(1, 1, 2, 2, 3, 3, 3, 4, 4, 4).distinct.length
  println(k) // size = 4

  // intersect - it will give back an array with the given elements
  val l = a.intersect(List(3, 4, 5))

  // union - it appends the second list to the end of the first

  // min, max
  a.min // 1
  a.max // 9
  a.sum // sum of the elements in the list
  a.sorted // it will give back a new collection in a sorted order of the elements

  // mkString
  // default one just makes a string and sticks all the value together
  println(a.mkString)
  println(a.mkString(", "))
  println(a.mkString("[", ", " , "]"))

  // zipp - zipp a list with another type of elements
  // zippWithIndex



  def main(args: Array[String]): Unit = {
    println(BasicSequenceMethods.a.size)

  }

}
