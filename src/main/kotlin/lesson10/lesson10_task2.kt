package lesson10

fun main() {
    print("Enter your login: ")
    val login = readln()
    print("Enter you password: ")
    val password = readln()
    checkingRegistrationInfoLength(login, password)
}

fun checkingRegistrationInfoLength(login: String, password: String) {
    if (login.length >= 4 && password.length >= 4) {
        println("Greetings!")
    }else{
        println("Login \"$login\" and(or) password \"$password\" in not long enough.")
    }
}