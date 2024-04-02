package lesson19

enum class Fishes(val fishName: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок"),
}

fun main() {
    println("Вы можете добавить этих рыбок в аквариум: ${Fishes.entries.joinToString { it.fishName }}.")
}

