package videos

object ObjectsAndMethods {

  // type inference - you don't need to define the type, you can omit it
  val name = "Anett Keszler"

  // you can define the type explicitly
  val name2: String = "Anett Keszler"

  val value = 42

  var age: Int = 22

  // difference between val and var: is the ability to make assignments, var can be reassigned to point to a different object, that is not true for val, it will always point to the same object
  // val is like 'final' in java
  age = 34
  // value = 44  it will give an error
  // String, Int, Double, Char, Boolean, Unit
  // Unit: doesn't represent any information

  // Tuple: fixed number of values, and they can have different types
  val t = (
    1,
    2.2,
    "hi there"
  )
  println(t._1)
  println(t._2)
  println(t._3)

  // pattern matching
  val (t1, t2, t3) = t





  def main(args: Array[String]): Unit = {


  }

}
