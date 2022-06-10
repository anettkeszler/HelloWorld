package codewars

object TransportationOnVacation {
  def cost(days: Int): Int = {
    val totalCost = days * 40
    days match {
      case d if(d >= 7) => totalCost - 50
      case d if(d >= 3) => totalCost - 20
      case _ => totalCost
    }
  }

}
