class PasswordValidator{

  def check(password: String): Boolean={
    if(password.matches("(^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,15}$)"))
      return true
    else
      return false
  }


}
