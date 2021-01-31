package validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Company
import com.knoldus.validator.{CompanyValidator, EmailValidator}
import org.mockito.MockitoSugar.{mock, when}
import org.scalatest.flatspec.AsyncFlatSpec

class TestCompanyValidator extends AsyncFlatSpec {

  val companyValidator=new CompanyValidator()
  val company=new Company("Panasonic","panasonic@info.com","Gurgaon")
  val mockedCompanyRead = mock[CompanyReadDto]
  val mockedEmail=mock[EmailValidator]

  "companyIsValid" should "return true" in {
    when(mockedCompanyRead.getCompanyByName("Panasonic")) thenReturn None

    when(mockedEmail.emailIdIsValid("panasonic@info.com")) thenReturn(true)

    val result=companyValidator.companyIsValid(company)

    assert(result === true)
  }
}
