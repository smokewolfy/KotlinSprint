package lesson20

class Gamer {
    var hasKey = false
}

fun main() {
    val checkKeyAvailable = { gamer: Gamer ->
        if (gamer.hasKey) println("Door now unlocked.") else println("Door is still locked. Find the key.")
    }
    val gamer = Gamer()
    checkKeyAvailable(gamer)
}