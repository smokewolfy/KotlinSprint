package lesson7

fun main() {
    var isAuthorized = false

    while (!isAuthorized){
        val code = sendSmsCode()
        print("Введите код авторизации: ")
        val userInput = readln().toInt()
        if(userInput == code) {
            println("Добро пожаловать!")
            isAuthorized = true
        } else{
            println("Неверный код.")
        }
    }
}

fun sendSmsCode():Int{
    val range = 1000..9999
    val code = range.random()
    println("Ваш код для авторизации: $code")
    return code
}