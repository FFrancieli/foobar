case class FooBar() {

  def calculate(number: Option[Int]) = number match {
    case num if num.get % 3 == 0 => "foo"
    case num if num.get % 7 == 0 => "bar"
    case _ => number.get
  }

}
