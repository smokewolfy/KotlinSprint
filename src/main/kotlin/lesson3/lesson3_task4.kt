package lesson3

fun main() {
    var moveFrom = "E2"
    var moveTo = "E4"
    var moveCount = 1

    var gameOutput = "[$moveFrom-$moveTo;$moveCount]"

    println(gameOutput)

    moveCount = 2
    moveFrom = "D2"
    moveTo = "D3"

    gameOutput = "[$moveFrom-$moveTo;$moveCount]"

    println(gameOutput)
}