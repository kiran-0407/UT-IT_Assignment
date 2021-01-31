package com.knoldus.db

import com.knoldus.models.Employee

import scala.collection.immutable.HashMap

class EmployeeReadDto {

  val employee1 :Employee = Employee("Kiranjeet","kaur",23,12000,"Intern","Knoldus","kiran.kaur@knoldus.com")
  val employee2 :Employee = Employee("Isha","Bahmra",26,24000,"Manager","Philips","philips123@gmail.com")

  val employees: HashMap[String, Employee] = HashMap("Kiranjeet" -> employee1, "Isha" -> employee2)

  def getEmployeeByName(name: String): Option[Employee] = employees.get(name)


}
