package lesson7

fun main() {
    print("Введите желаемую длинну пароля: ")
    val passwordSize = passwordLengthProcess(readln())
    val lowerCaseCharRange = 'a'..'z'
    val upperCaseCharRange = 'A'..'Z'
    val digitRange = '0'..'9'
    val allChars = lowerCaseCharRange + upperCaseCharRange + digitRange
    val password: MutableList<Char> = mutableListOf()
    password.add(lowerCaseCharRange.random())
    password.add(upperCaseCharRange.random())
    password.add(digitRange.random())
    for (step in password.size until passwordSize) {
        password.add(allChars.random())
    }
    println(password.shuffled().joinToString(separator = ""))

}

fun passwordLengthProcess(inputLength: String): Int {
    return if (inputLength.toInt() < MIN_PASSWORD_LENGTH) {
        println("Введена слишком маленькая длинна пароля.")
        println("Установленна минимальная величина - $MIN_PASSWORD_LENGTH")
        MIN_PASSWORD_LENGTH
    } else {
        inputLength.toInt()
    }
}

const val MIN_PASSWORD_LENGTH = 6