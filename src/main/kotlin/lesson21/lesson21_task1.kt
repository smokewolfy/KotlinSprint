package lesson21

fun main() {
    val hello = "hellO TherE"
    println(hello.vowelCount())
}

fun String.vowelCount(): Int {
    return this.count { it in VOWELS }
}

const val VOWELS = "aeiouyAEIOUY"