package lesson7

fun main() {
    print("Введите желаемую длинну пароля: ")
    val passwordSize = passwordLengthProcess(readln())
    val lowerCaseCharRange = 'a'..'z'
    val upperCaseCharRange = 'A'..'Z'
    val digitRange = '0'..'9'

    val charsCountList = calculateCountOfChars(passwordSize)

    var password = ""
    for (step in charsCountList[0] downTo 1) {
        password += upperCaseCharRange.random()
    }
    for (step in charsCountList[1] downTo 1) {
        password += digitRange.random()
    }
    for (step in charsCountList[2] downTo 1) {
        password += lowerCaseCharRange.random()
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

fun calculateCountOfChars(passwordSize: Int):List<Int>{
    val upperCharCount = passwordSize / COUNT_OF_CHAR_TYPES
    val digitCount = passwordSize / COUNT_OF_CHAR_TYPES
    val lowerCharCount = passwordSize - (digitCount + upperCharCount)
    return listOf(upperCharCount, digitCount, lowerCharCount)
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