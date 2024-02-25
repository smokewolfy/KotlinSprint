package lesson11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String
) {
    override fun toString():String{
        return "id: $id\nlogin: $login\npassword: $password\nemail: $email\n"
    }
}


fun main() {
    val user1 = User(
        id = 1,
        login = "login1",
        password = "password1",
        email = "1@1.com"
    )
    val user2 = User(
        id = 2,
        login = "login2",
        password = "password2",
        email = "2@2.com"
    )

    println(user1.toString())
    println(user2.toString())
}