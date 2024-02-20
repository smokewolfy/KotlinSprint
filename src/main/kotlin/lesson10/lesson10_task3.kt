package lesson10

fun main() {
    print("Enter password length: ")
    val passwordLength = readln().toInt()
    println(generatePassword(passwordLength))
}

fun generatePassword(length: Int): String {
    var password = ""
    for (i in 0 until length) {
        password += if (i % 2 == 0) {
            digitRange.random()
        } else {
            specSymbolsRange.random()
        }

    }
    return password
}

const val digitRange = "0123456789"
const val specSymbolsRange = "!\"#$%&'()*+,-./ "