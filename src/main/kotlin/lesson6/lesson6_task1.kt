package lesson6

fun main() {
    var isNotSignUp = true
    var isNotSignIn: Boolean

    var userLogin = ""
    var userPassword = ""

    do {

        //Проверка на регистрацию
        if (isNotSignUp) {
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
        //Авторизация
        print("Введите логин для входа: ")
        val signInLogin = readln()
        print("Введите пароль для входа: ")
        val signInPassword = readln()
        isNotSignIn = !((userLogin == signInLogin) && (userPassword == signInPassword))
        if (!isNotSignIn) println("Авторизация прошла успешно")
    } while (isNotSignIn)
}