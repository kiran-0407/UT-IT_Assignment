package db

import com.knoldus.db.UserReadDto
import org.scalatest.funsuite.AnyFunSuite

class TestUserReadDto extends AnyFunSuite {

  val userReadDto= new UserReadDto()

  test("To test user read dto for user existing in db"){
    assert(userReadDto.getUserByName("Shraddha")!=None)
  }

  test("To test user read dto for user not existing in db"){
    assert(userReadDto.getUserByName("Abc")==None)
  }


}
