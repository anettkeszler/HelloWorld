package codewars

object CountingSheep {
  def countSheep(sheep: Array[Boolean]): Int = {
    var counter = 0
    for (s <- sheep) {
      if (s == true) {
        counter+=1
      }
    }
    counter
  }

  def countSheep2(sheep: Array[Boolean]): Int = {
    sheep.count(_ == true)
  }
}
