import org.scalatest.WordSpec

class FooBarTest extends WordSpec {

  "Foobar" should {
    "return input number when it is not divisible by 3, 7 or 21" in {
      val foobar: FooBar = new FooBar()

      assert(foobar.calculate(Some(1)) == 1)
      assert(foobar.calculate(Some(5)) == 5)
    }
  }
}
