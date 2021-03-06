object UnifiedTypes {
  def main(args: Array[String]): Unit = {
    // 1. TYPE HIERARCHY
    // in scala, all values have a type, including numerical values and functions
    // 'Any' is the supertype of all types, also called the top type. It defines certain universal methods such as equals, hashCode, ans toString. 'Any' has 2 direct subclasses: 'AnyVal' and AnyRef
    // 'AnyVal' represents value types. There are nine predefined value types and they are non-nullable.
    // Double, Float, Long, Int, Short, Byte, Char, Unit, Boolean
    // Unit is a value type which caries no meaningful information. There is exactly one instance of Unit which can be declared literally like so: (). All functions must return something so sometimes Unit is a useful return type.

    // AnyRef represents reference types. All non-value types are defined as reference types. Every user-defined type in Scala is a subtype of AnyRef.
    // If Scala is used in the context of a Java runtime environment, AnyRef corresponds to java.lang.Object.

    // This example demonstrates that strings, integers, characters, boolean values, and functions are all of type Any just like every other object:

    val list: List[Any] = List(
      "a string",
      34,
      'c',
      true,
      () => "an anonymous function returning a string",
      System.getProperty("user.name")
    )

    list.foreach(element => println(element))
    // It defines a value list of type List[Any].
    // The list is initialized with elements of various types, but each is an instance of scala.Any, so you can add them to the list.

    // 2. TYPE CASTING
    // value types can be cast in the following ways:
    // Byte -> Short -> Int -> Long -> Float -> Double
    //                   |
    //                  Char

    val x: Long = 987654321
    val y: Float = x

    val face: Char = '☺'
    val faceToNumber: Int = face
    println(faceToNumber) // 9786

    // casting is unidirectional, the other way will not compile.
    // val z: Long = y - does not compile

    // 3. NOTHING AND NULL
    // Nothing is a subtype of all types, also called the bottom type.
    // There is no value that has type Nothing.
    // A common use is to signal non-termination such as a thrown exception, program exit, or an infinite loop (i.e., it is the type of an expression which does not evaluate to a value, or a method that does not return normally).
    //
    //Null is a subtype of all reference types (i.e. any subtype of AnyRef).
    // It has a single value identified by the keyword literal null.
    // Null is provided mostly for interoperability with other JVM languages and should almost never be used in Scala code.


  }

}
