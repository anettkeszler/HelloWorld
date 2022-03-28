
object Classes {
  def main(args: Array[String]): Unit = {
    // 1. DEFINING A CLASS
    // classes are blueprints for creating objects.
    // they can contain methods, values, variables, types, objects, traits and classes --> collectively called members.

    class User
    val user1 = new User

    // the keyword 'new' is used to create an instance of the class.
    // 'User' has a default constructor which takes o arguments because no constructor was defined.

    class Point(var x: Int, var y: Int) {
      def move(dx: Int, dy: Int): Unit = {
        x = x + dx
        y = y + dy
      }

      override def toString: String = {
        s"$x $y"
      }
    }

    val point1 = new Point(2,3)
    println(point1)
    println(point1.x)

    // This Point class has four members: the variables x and y and the methods move and toString.
    // Unlike many other languages, the primary constructor is in the class signature (var x: Int, var y: Int).
    // The move method takes two integer arguments and returns the Unit value (), which carries no information. This corresponds roughly with void in Java-like languages.
    // toString, on the other hand, does not take any arguments but returns a String value. Since toString overrides toString from AnyRef, it is tagged with the override keyword.

    // 2. CONSTRUCTORS
    // Constructors can have optional parameters by providing a default value like so:
    class Point2(var x: Int = 0, var y: Int = 0)

    val origin = new Point2 // x and y are both set to 0
    val point_1 = new Point2(1) // x is 1, y is 0
    val point_2 = new Point2(1, 1) // a and y are both set to 1
    println(point_2.x)

    // In this version of the Point class, x and y have the default value 0 so no arguments are required.
    // However, because the constructor reads arguments left to right, if you just wanted to pass in a y value, you would need to name the parameter.

    val point_3 = new Point2(y = 2) // x will be 0 and y is 2
    println(point_3.y)

    // 3. PRIVATE MEMBERS AND GETTER/SETTER SYNTAX
    // Members are public by default.
    class Point3 {
      private var _x = 0
      private var _y = 0
      private val bound = 100

      def x = _x
      def x_= (newValue: Int): Unit = {
        if (newValue < bound) _x = newValue else printWarning
      }

      def y = _y
      def y_= (newValue: Int): Unit = {
        if (newValue < bound) _y = newValue else printWarning
      }

      private def printWarning = println("WARNING: Out of bounds")
    }

    val point_4 = new Point3
    point_4.x = 99
    point_4.y = 101 // prints the warning


    // In this version of the Point class, the data is stored in private variables _x and _y.
    // There are methods def x and def y for accessing the private data. def x_= and def y_= are for validating and setting the value of _x and _y.
    // Notice the special syntax for the setters: the method has _= appended to the identifier of the getter and the parameters come after.
    //
    //Primary constructor parameters with val and var are public. However, because vals are immutable, you can’t write the following.

    class Point5(val x: Int, val y: Int)
    val point5 = new Point5(1, 2)
   // point.x = 3  // <-- does not compile

    // Parameters without val or var are private values, visible only within the class.
    class Point6(x: Int, y: Int)
    val point6 = new Point6(1, 2)
    // point.x  // <-- does not compile







  }

}
