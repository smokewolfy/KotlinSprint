package lesson6

fun main() {
    var isNotSignUp = true
    var isNotSignIn = true

    var userLogin = ""
    var userPassword = ""

    while (isNotSignIn) {

        while (isNotSignUp) {
            print(
                """Вы выбрали регистрацию
            |Введите логин: 
        """.trimMargin()
            )
            userLogin = readln()
            print("Введите пароль: ")
            userPassword = readln()
            isNotSignUp = !(userLogin.isNotEmpty() && userPassword.isNotEmpty())
        }

        print("Введите логин для входа: ")
        val signInLogin = readln()
        print("Введите пароль для входа: ")
        val signInPassword = readln()
        isNotSignIn = !((userLogin == signInLogin) && (userPassword == signInPassword))
        if (!isNotSignIn) println("Авторизация прошла успешно")
    }
}