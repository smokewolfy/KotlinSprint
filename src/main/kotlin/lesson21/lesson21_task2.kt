package lesson21

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println( list.evenNumbersSum())

}

fun List<Int>.evenNumbersSum(): Int {
    var evenSum = 0
    this.forEach {
        if ((it % 2) == 0) evenSum += it
    }
    return evenSum
}