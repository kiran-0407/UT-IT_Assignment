package com.knoldus.validator
import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Employee

class EmployeeValidator {


  val cmpOb=new CompanyReadDto()
  val emailOb=new EmailValidator()

  def employeeIsValid(employee: Employee): Boolean ={

    if(emailOb.emailIdIsValid(employee.emailId)&& cmpOb.getCompanyByName(employee.companyName)!=None)
      {
        return true;
      }
      else {
      return false;
    }

  }
}
