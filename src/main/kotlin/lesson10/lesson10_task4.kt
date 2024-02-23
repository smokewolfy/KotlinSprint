package lesson10

fun main() {
    var roundCounter = 0
    val human = "Meatbag"
    val computer = "Computer"
    do {
        makeRound(human, computer)
        roundCounter++
        print("Do you want to play again?(yes/no)")
        println()

        if (readln() == "yes") {
            println()
            continue
        } else break

    } while (true)

    println("Round played: $roundCounter")
}

fun throwDice(): Int {
    val diceRange = 1..6
    return diceRange.random()
}

fun makeRound(firstPlayer: String, secondPlayer: String) {
    val firstPlayerResult = throwDice()
    val secondPlayerResult = throwDice()
    println("$firstPlayer throwing dice. Result: $firstPlayerResult")
    println("$secondPlayer throwing dice. Result: $secondPlayerResult")
    println(
        "The winner is: ${
            when {
                firstPlayerResult > secondPlayerResult -> firstPlayer
                firstPlayerResult == secondPlayerResult -> "friendship(no)"
                else -> secondPlayer
            }
        }\n"
    )
}