package db

import com.knoldus.db.EmployeeReadDto
import org.scalatest.funsuite.AnyFunSuite

class TestEmployeeReadDto extends AnyFunSuite {

  val employeeReadDto= new EmployeeReadDto()

  test("To test employee read dto"){
    assert(employeeReadDto.getEmployeeByName("Kiranjeet")!=None)
  }

  test("To test employee read dto for employee not existing in db"){
    assert(employeeReadDto.getEmployeeByName("Seerat")==None)
  }


}