package request

import com.knoldus.models.Company
import com.knoldus.request.CompanyImpl
import com.knoldus.validator.CompanyValidator
import org.mockito.MockitoSugar.{mock, when}
import org.scalatest.flatspec.AsyncFlatSpec

class TestCompanyImpl extends AsyncFlatSpec {

  val testCompany= new Company("Knoldus", "knoldus@gmail.com", "Noida")

  val mockedCompanyValidator = mock[CompanyValidator]
  val company = new CompanyImpl(mockedCompanyValidator)

  "createCompany" should "not return empty" in {
    when(mockedCompanyValidator.companyIsValid(testCompany)) thenReturn true

    val result = company.createCompany(testCompany)

    assert(!(result.isEmpty))
  }

}