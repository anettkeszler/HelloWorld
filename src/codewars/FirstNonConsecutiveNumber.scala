package codewars

object FirstNonConsecutiveNumber {
  def firstConsNum(values: Seq[Int]): Option[Int] = {
    var res: Option[Int] = None
    for(i <- 1 until values.length)
      if (values(i) - values(i - 1) != 1 && res == None)
        res = Some(values(i))
    res
  }
}
