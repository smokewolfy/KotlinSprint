package lesson18

open class Animal(val name: String) {
    open val food: String = "корм"

    fun play() {
        println("$name - играет.")
    }

    fun eat() {
        println("$name - ест $food.")
    }

    fun sleep() {
        println("$name - спит.")
    }
}

class Fox(
    name: String,

    ) : Animal(name) {
    override val food: String = "ягоды"
}


class Cat(
    name: String,
) : Animal(name) {
    override val food: String = "рыбки"
}

class Dog(
    name: String,
) : Animal(name) {
    override val food: String = "кость"
}


fun main() {
    val tamagotchi: List<Animal> = listOf(
        Fox("Алиса"),
        Cat("Барсик"),
        Dog("Шарик")
    )
    tamagotchi.forEach { it.play() }
    println()
    tamagotchi.forEach { it.eat() }
    println()
    tamagotchi.forEach { it.sleep() }

}