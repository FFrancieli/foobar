case class FooBar() {

  def calculate(number: Option[Int]) = (number.get % 3, number.get % 7) match {
    case (0, _) => "foo"
    case (_, 0) => "bar"
    case _ => number.get
  }

}
