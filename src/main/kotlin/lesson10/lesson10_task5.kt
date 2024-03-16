package lesson10

fun main() {
    val userLogin = "Peter"
    val userPassword = "Password"
    val userShopList = listOf("Candy", "Bread", "Milk")
    println("Введите логин: ")
    val inputLogin = readln()
    println("Введите пароль: ")
    val inputPassword = readln()
    println( returnAuthorisationResult(userLogin, userPassword, userShopList, inputLogin, inputPassword))
}

fun returnAuthorisationResult(
    userLogin: String,
    userPassword: String,
    userShopList: List<String>,
    inputLogin: String,
    inputPassword: String
): String {
    return if (verification(userLogin, userPassword, inputLogin, inputPassword) != null) {
        "Приветствую, ${userLogin}. Ваша корзина:\n${userShopList.joinToString(separator = ", ")}"
    } else {
        "Авторизация неудалась. Попробуйте еще раз."
    }
}

fun verification(userLogin: String, userPassword: String, inputLogin: String, inputPassword: String): String? {
    val isVerified = userLogin.lowercase() == inputLogin.lowercase() && userPassword == inputPassword
    return createToken(isVerified)
}

fun createToken(isVerified: Boolean): String? {
    var token = ""
    if (isVerified) {
        repeat(TOKEN_LENGTH) {
            token += CHARS.random()
        }
    }
    return token.ifEmpty { null }
}

const val CHARS = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
const val TOKEN_LENGTH = 32