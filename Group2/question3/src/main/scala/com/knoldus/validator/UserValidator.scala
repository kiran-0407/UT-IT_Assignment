package com.knoldus.validator
import com.knoldus.models.User
import com.knoldus.db.CompanyReadDto

class UserValidator {

  val companyReadDto=new CompanyReadDto()
  val emailValidator=new EmailValidator()

  def userIsValid(user: User): Boolean ={

    if(emailValidator.emailIdIsValid(user.emailId)&& companyReadDto.getCompanyByName(user.companyName)!=None)
    {
      return true;
    }
    else {
      return false;
    }

  }

}
