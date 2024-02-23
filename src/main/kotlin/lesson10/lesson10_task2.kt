package lesson10

fun main() {
    print("Enter your login: ")
    val login = readln()
    print("Enter you password: ")
    val password = readln()
    println(
        if (checkInfoLength(login) && checkInfoLength(password)) {
            "Greetings!"
        } else {
            "Login \"$login\" and(or) password \"$password\" in not long enough."
        }
    )
}

fun checkInfoLength(string: String): Boolean = string.length >= minLength


const val minLength = 4