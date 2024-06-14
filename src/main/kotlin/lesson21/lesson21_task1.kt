package lesson21

fun main() {
    val hello = "hellO TherE"
    println(hello.vowelCount())
}

fun String.vowelCount(): Int {

    var vowelCount = 0
    for (i in this.indices) {
        if (this[i] in vowels)
             vowelCount++
    }

    return vowelCount
}

const val vowels = "aeiouyAEIOUY"