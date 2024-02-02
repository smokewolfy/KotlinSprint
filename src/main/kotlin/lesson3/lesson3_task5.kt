package lesson3

fun main() {
    val input = "D2-D4;0"
    val moveFrom = input.substringBefore("-")
    val moveTo = input.substringAfter("-").substringBefore(";")
    val moveCount = input.substringAfter(";").toInt()
    println(moveFrom)
    println(moveTo)
    println(moveCount)
}