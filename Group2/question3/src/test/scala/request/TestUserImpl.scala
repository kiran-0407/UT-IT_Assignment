package request

import com.knoldus.models.User
import com.knoldus.request.UserImpl
import com.knoldus.validator.UserValidator
import org.mockito.MockitoSugar.{mock, when}
import org.scalatest.flatspec.AsyncFlatSpec

class TestUserImpl extends AsyncFlatSpec {

  val user1= new User("Kiran",23,"intern", "Knoldus", "knoldus@gmail.com")

  val mockedUserValidator = mock[UserValidator]
  val userImplObject = new UserImpl(mockedUserValidator)

  "createUser" should "not return empty" in {
    when(mockedUserValidator.userIsValid(user1)) thenReturn true

    val result = userImplObject.createUser(user1)

    assert(!(result.isEmpty))
  }

}