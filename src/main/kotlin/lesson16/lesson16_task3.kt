package lesson16

class User(
    private val login: String,
    private val password: String,
) {
    fun checkPassword(inputPassword: String): Boolean{
        return inputPassword == password
    }
}

fun main(){
    val user = User(login = "Resu", password = "Drowssap")
    println("Пароль ${if (user.checkPassword("Drowssap")) "верный." else "неверный."}")
    println("Пароль ${if (user.checkPassword("Password")) "верный." else "неверный."}")
}