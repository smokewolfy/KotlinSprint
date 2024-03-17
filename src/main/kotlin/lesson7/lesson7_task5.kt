package lesson7

fun main() {
    print("Введите желаемую длинну пароля: ")
    val passwordSize = passwordLengthProcess(readln()) - COUNT_OF_CHAR_TYPES
    val lowerCaseCharRange = 'a'..'z'
    val upperCaseCharRange = 'A'..'Z'
    val digitRange = '0'..'9'
    val allChars = lowerCaseCharRange + upperCaseCharRange + digitRange
    var password = "" + lowerCaseCharRange.random() + upperCaseCharRange.random() + digitRange.random()
    println(password)

    for (step in passwordSize downTo 1) {
        password += allChars.random()
    }

    password = password.shuffle()
    println(password)
}


fun String.shuffle(): String {
    val string: MutableList<String> = mutableListOf()
    for (char in this) {
        string.add(char.toString())
    }
    return string.shuffled().joinToString("")
}


fun passwordLengthProcess(inputLength: String): Int {
    val passwordLength = try {
        when (inputLength.toInt()) {
            in 0..5 -> {
                println("Введена слишком маленькая длинна пароля.")
                println("Установленна минимальная величина - 6")
                6
            }

            else -> inputLength.toInt()
        }
    } catch (e: Exception) {
        println("Вы не ввели длинну пароля.")
        println("Установленна минимальная величина - 6")
        6
    }
    return passwordLength
}

const val COUNT_OF_CHAR_TYPES = 3