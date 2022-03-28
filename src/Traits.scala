import scala.collection.mutable.ArrayBuffer

object Traits {
  def main(args: Array[String]): Unit = {
    // Traits are used to share interfaces and fields between classes.
    // They are similar to Java 8’s interfaces.
    // Classes and objects can extend traits, but traits cannot be instantiated and therefore have no parameters.

    // 1. DEFINING A TRAIT
    // A minimal trait is simply the keyword trait and an identifier:
    trait HairColor
    // Traits become especially useful as generic types and with abstract methods.
    trait Iterator[A] {
      def hasNext: Boolean
      def next(): A
    }
    // Extending the trait Iterator[A] requires a type A and implementations of the methods hasNext and next.

    // 2. USING TRAITS
    // use the 'extends' keyword to extend a trait.
    // Then implement any abstract members of the trait using the 'override' keyword

    class IntIterator(to: Int) extends Iterator[Int] {
      private var current = 0

      override def hasNext: Boolean = current < to

      override def next(): Int = {
        if (hasNext) {
          val t = current
          current+=1
          t
        } else 0
      }
    }

    val iterator = new IntIterator(10)
    iterator.next() // returns 0
    iterator.next() // returns 1

    // This IntIterator class takes a parameter to as an upper bound.
    // It extends Iterator[Int] which means that the next method must return an Int.

    // 3. SUBTYPING
    // Where a given trait is required, a subtype of the trait can be used instead.

    trait Pet {
      val name: String
    }

    class Cat(val name: String) extends Pet
    class Dog(val name: String) extends Pet

    val cat = new Cat("Harry")
    val dog = new Dog("Larry")

    val animals = ArrayBuffer.empty[Pet]

    animals.append(cat)
    animals.append(dog)

    animals.foreach(pet => println(pet.name)) // Harry Larry
    // The trait Pet has an abstract field name that gets implemented by Cat and Dog in their constructors.
    // On the last line, we call pet.name, which must be implemented in any subtype of the trait Pet.

  }

}
