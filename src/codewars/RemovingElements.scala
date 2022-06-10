package codewars

object RemovingElements {
  def removeEverySecondElement[T](input: List[T]): List[T] = {
    input.zipWithIndex
      .filter { case (_, i) => (i + 1) % 2 != 0 }
      .map { case (e, _) => e }
  }
}
