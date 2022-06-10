package codewars

object Main {
  def main(args: Array[String]): Unit = {
    println(CountingSheep.countSheep(Array(
      true, true, true, false,
      true, true, true, true,
      true, false, true, false,
      true, false, false, true,
      true, true, true, true,
      false, false, true, true
    )))

    println(CountingSheep.countSheep2(Array(
      true, true, true, false,
      true, true, true, true,
      true, false, true, false,
      true, false, false, true,
      true, true, true, true,
      false, false, true, true
    )))

    println(Grasshopper.checkForFactor(25, 5))
    println(Grasshopper.checkForFactor(26, 5))

    println(Grasshopper.checkForFactor2(25, 5))
    println(Grasshopper.checkForFactor2(26, 5))

    println(TransportationOnVacation.cost(2))
    println(TransportationOnVacation.cost(4))
    println(TransportationOnVacation.cost(7))

    println(RemovingElements.removeEverySecondElement(List("Keep", "Remove", "Keep", "Remove", "Keep")))
    println(RemovingElements.removeEverySecondElement(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))

    println(Summation.sum(3))
    println(Summation.sum(8))
    println(Summation.sum(12))

    println(FirstNonConsecutiveNumber.firstConsNum(List(1, 2, 3, 4, 6, 7, 8, 9))) // --> 6
    println(FirstNonConsecutiveNumber.firstConsNum(List(1, 2, 3, 4, 5, 6, 7, 8, 9))) // --> None
  }
}
