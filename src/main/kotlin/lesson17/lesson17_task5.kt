package lesson17

class User(
    _login: String,
    _password: String,
) {
    var login = _login
        set(value) {
            field = value
            println("Логин успешно изменен на $field.")
        }
    var password = _password
        get() {
            return "*".repeat(field.length)
        }
        set(value) {
            println("Вы не можете изменить пароль.")
        }
}

fun main() {
    val user = User("Login", "password")
    user.password = "pretzel"
    println(user.password)
    user.login = "BeerMaster"
}