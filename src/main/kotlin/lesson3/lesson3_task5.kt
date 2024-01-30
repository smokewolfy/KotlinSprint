package lesson3

fun main() {
    var input = "D2-D4;0"
    var moveFrom = input.substringBefore("-")
    var moveTo = input.substringAfter("-").substringBefore(";")
    var moveCount = input.substringAfter(";").toInt()
    println("""
        |Ход номер $moveCount
        |Белые ходят:
        |С $moveFrom на $moveTo
        |
    """.trimMargin())
}