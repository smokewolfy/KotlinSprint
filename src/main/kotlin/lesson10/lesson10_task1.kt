package lesson10

fun main() {
    val human = "Meatbag"
    val computer = "Computer"
    val humanResult = throwingDice(human)
    val computerResult = throwingDice(computer)
    println(
        "The winner is: ${
            if (humanResult > computerResult) human
            else if (humanResult == computerResult) "friendship(no)"
            else computer
        }"
    )
}

fun throwingDice(user: String): Int {
    val diceSide = (1..6).random()
    println("$user throwing dice. Result: $diceSide")
    return diceSide
}