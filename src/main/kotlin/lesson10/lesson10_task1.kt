package lesson10

fun main() {
    val human = "Meatbag"
    val computer = "Computer"
    val humanResult = throwDice(human)
    val computerResult = throwDice(computer)
    println(
        "The winner is: ${
            when {
                humanResult > computerResult -> human
                humanResult == computerResult -> "friendship(no)"
                else -> computer
            }
        }"
    )
}

fun throwDice(user: String): Int {
    val diceSide = (1..6).random()
    println("$user throwing dice. Result: $diceSide")
    return diceSide
}