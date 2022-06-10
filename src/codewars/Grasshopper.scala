package codewars

object Grasshopper {
  def checkForFactor(base: Int, factor: Int): Boolean = {
    if (base%factor == 0) {
      true
    } else {
      false
    }
  }

  def checkForFactor2(base: Int, factor: Int): Boolean = {
    base % factor match {
      case 0 => true
      case _ => false
    }
  }

}
