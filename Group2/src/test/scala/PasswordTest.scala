import org.scalatest.FunSuite

class PasswordTest extends FunSuite {

  val passwordOb=new PasswordValidator()

  test("To check if password contains atleast one digit"){
    assert(passwordOb.check("Abc12*kj") ===true)
  }

  test("To check if password does not contains space"){
    assert(!passwordOb.check("Abc 12*kj") ===true)
  }

  test("To check length is greater than 8 characters and less than 15"){
    assert(!passwordOb.check("Abc12") ===true)
  }

  test("To check password contains atleast one lowercase letter"){
    assert(!passwordOb.check("ABC12DE*") ===true)
  }

  test("To check password contains atleast one uppercase letter"){
    assert(!passwordOb.check("abc12de*") ===true)
  }

  test("To check password contains atleast one special character"){
    assert(!passwordOb.check("ABC12DE") ===true)
  }



}
