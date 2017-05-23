case class FooBar() {

  def calculate(number: Option[Int]) = number match {
    case _ => number.get
  }

}
