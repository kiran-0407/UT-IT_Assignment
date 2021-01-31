import org.scalatest.FunSuite
class TestPalindromeFactorial extends FunSuite {

  val numberOb=new Number()

  test("To check Palindrome"){
    assert(numberOb.palindrome(121)==true)
  }

  test("Palindrome check when passing number which is not palindrome"){
    assert(!numberOb.palindrome(123)==true)
  }

  test("To check factorial "){
    assert(numberOb.factorial(5)==120)
  }

  test("Factorial check again"){
    assert(numberOb.factorial(4)!=120)
  }
}
