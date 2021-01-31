
class Number extends CheckPalindromeFactorial {

  override def factorial(n: Int): Int = {
    if (n == 0)
      return 1
    else
      return n * factorial(n - 1)
  }

  override def palindrome(num: Int): Boolean = {
    val Convert = num.toString
    if (Convert.equals(Convert.reverse)) {
      return true
    }
    else {
      return false
    }

  }
}
