package lesson10

fun main() {
    val userLogin = "Peter"
    val userPassword = "Password"
    val userShopList = listOf("Candy", "Bread", "Milk")
    printShopList(userLogin, userPassword, userShopList)
}

fun printShopList(userLogin: String, userPassword: String, userShopList: List<String>) {
    println("Введите логин: ")
    val login = readln()
    println("Введите пароль: ")
    val password = readln()
    val token = verification(userLogin, userPassword, login, password)
    println(
        if (token != null) {
            "Приветствую, ${userLogin}. Ваша корзина:\n${userShopList.joinToString(separator = ", ")}"
        } else {
            "Авторизация неудалась. Попробуйте еще раз."
        }
    )
}

fun verification(userLogin: String, userPassword: String, inputLogin: String, inputPassword: String): String? {
    var token: String? = ""
    if (userLogin.lowercase() == inputLogin.lowercase() && userPassword == inputPassword) {
        repeat(TOKEN_LENGTH) {
            token += CHARS.random()
        }
    } else return null

    return token
}

const val CHARS = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
const val TOKEN_LENGTH = 32