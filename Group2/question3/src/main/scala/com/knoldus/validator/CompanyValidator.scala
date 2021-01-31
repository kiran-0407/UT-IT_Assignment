package com.knoldus.validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Company
import com.knoldus.models.Employee

class CompanyValidator {

  val cmpOb=new CompanyReadDto()
  val emailOb=new EmailValidator()

  def companyIsValid(company: Company): Boolean = {

    if(emailOb.emailIdIsValid(company.emailId) && cmpOb.getCompanyByName(company.name)==None)
    {
      return true
    }
    else {
      return false
    }
  }
}
