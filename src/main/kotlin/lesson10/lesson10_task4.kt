package lesson10

fun main() {
    var winCounter = 0
    val human = "Meatbag"
    val computer = "Computer"
    do {
        if (makeRound(human, computer) == human) winCounter++
        print("Do you want to play again?(yes/no)")
        println()
        if (readln() == "yes") {
            println()
            continue
        } else break

    } while (true)
    println("Win rounds: $winCounter")
}


fun throwDice(): Int {
    val diceRange = 1..6
    return diceRange.random()
}


fun makeRound(firstPlayer: String, secondPlayer: String): String {
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
    return if (firstPlayerResult > secondPlayerResult) firstPlayer else secondPlayer
}