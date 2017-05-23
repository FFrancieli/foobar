import org.scalatest.WordSpec

class FooBarTest extends WordSpec {

  "Foobar" should {
    "return input number when it is not divisible by 3, 7 or 21" in {
      val foobar: FooBar = new FooBar()

      assert(foobar.calculate(Some(1)) == 1)
      assert(foobar.calculate(Some(5)) == 5)
    }

    "return foo" when {
      "number is 3" in {
        val foobar: FooBar = new FooBar()

        assert(foobar.calculate(Some(3)) == "foo")
      }

      "number is divisible by 3" in {
        val foobar: FooBar = new FooBar()

        assert(foobar.calculate(Some(21)) == "foo")
      }
    }

    "return bar" when {
      "number is 7" in {
        val foobar: FooBar = new FooBar()

        assert(foobar.calculate(Some(7)) == "bar")
      }

      "number is divisible by 7" in {
        val foobar: FooBar = new FooBar()

        assert(foobar.calculate(Some(49)) == "bar")
      }
    }
  }
}
