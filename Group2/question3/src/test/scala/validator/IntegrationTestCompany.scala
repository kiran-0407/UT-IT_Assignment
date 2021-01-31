package validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Company
import com.knoldus.validator.{CompanyValidator, EmailValidator}
import org.scalatest.funsuite.AnyFunSuite

class IntegrationTestCompany extends AnyFunSuite{

  val companyValidator=new CompanyValidator()
  val company=new Company("Samsung","samsung11@gmail.com","Mumbai")
  val companyReadDto = new CompanyReadDto()
  val obEmail=new EmailValidator()

  test("Should return true if company is valid"){
    val result=companyValidator.companyIsValid(company)
    assert(result === true)
  }






}
