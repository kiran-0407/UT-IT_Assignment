package validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.User
import com.knoldus.validator.{EmailValidator, UserValidator}
import org.scalatest.funsuite.AnyFunSuite

class IntegrationTestUser extends AnyFunSuite {

  val userValidator=new UserValidator()
  val user=new User("Kiran",23,"Intern","Knoldus","kiran.kaur@knoldus.com")
  val obCompanyRead = new CompanyReadDto()
  val obEmail=new EmailValidator()


  test("Should return true if user is valid"){
    //val result=userValidator.userIsValid(user)
    //assert(result === true)
    assert(obEmail.emailIdIsValid(user.emailId)==true && obCompanyRead.getCompanyByName(user.companyName)!=None)
  }


}
