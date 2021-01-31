package com.knoldus.db
import com.knoldus.models.User

import scala.collection.immutable.HashMap

class UserReadDto {

  val user1: User = User("Shraddha", 25, "Developer","Philips","shr04@gmail.com")
  val user2: User = User("Nitin", 27, "Tester","Knoldus","nitin12@gmail.com")

  val users: HashMap[String, User] = HashMap("Shraddha" -> user1, "Nitin" -> user2)

  def getUserByName(name: String): Option[User] = users.get(name)





}
