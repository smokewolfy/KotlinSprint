package lesson3

fun main() {
    var moveFrom = "E2"
    var moveTo = "E4"
    var moveCount = 1

    var gameOutput = """
        |Ход номер $moveCount
        |Белые ходят:
        |С $moveFrom на $moveTo
        |
    """.trimMargin()

    println(gameOutput)

    moveCount = 2
    moveFrom = "D2"
    moveTo = "D3"

    gameOutput = """
        |Ход номер $moveCount
        |Белые ходят:
        |С $moveFrom на $moveTo
        |
    """.trimMargin()

    println(gameOutput)
}