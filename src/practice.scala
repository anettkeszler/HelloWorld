import java.util
import scala.collection.mutable

object practice {
  def main(args: Array[String]): Unit = {

    var indexedSequence = IndexedSeq[(Int, String)]()

    var linkedHashMap1 = mutable.LinkedHashMap[Int, (Int, String)]()

    indexedSequence = indexedSequence:+ (1, "Aron")
    indexedSequence :+= (0, "Anett")
    indexedSequence :+= (3, "Balazs")

    linkedHashMap1.addOne((1, (1, "Aron"))).addOne((0, (0, "Anett"))).addOne((2, (3, "Balazs")))

    indexedSequence.foreach(index => println(index))
    println("---------------------------------------------")

    linkedHashMap1.foreach(i => println(i))






  }

}
