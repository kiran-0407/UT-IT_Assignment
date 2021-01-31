package db
import com.knoldus.db.CompanyReadDto
import org.scalatest.funsuite.AnyFunSuite

class TestCompanyReadDto extends AnyFunSuite {

  val companyReadDto= new CompanyReadDto()

  test("To test company read dto"){
    assert(companyReadDto.getCompanyByName("Knoldus")!=None)
  }

  test("To test company read dto for company not existing in db"){
    assert(companyReadDto.getCompanyByName("Xyz")==None)
  }



}
