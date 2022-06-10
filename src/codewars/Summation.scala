package codewars

object Summation {
  def sum(num: Int): Int = {
    var counter = 0
    for(i <- 1 to num) {
      counter+=i
    }
    counter
  }

  def sum2(n: Int): Int = (1 to n).sum
}
