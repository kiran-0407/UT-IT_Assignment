package validator

import com.knoldus.validator.EmailValidator
import org.scalatest.funsuite.AnyFunSuite

class TestEmailValidation extends AnyFunSuite{

  val emailObject=new EmailValidator()

  test("Checking email id  is valid or not"){
    assert(emailObject.emailIdIsValid("kiran12@gmail.com")===true)
  }

}
