package lesson7

fun main() {
    val createStep = 0..5
    val intRange = 0..9
    val charRange = 'a'..'z'
    var password = ""

    for (i in createStep) {
        password += if (i % 2 == 0) charRange.random() else intRange.random()

    }
    println(password)

}

