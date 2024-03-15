package lesson15

interface Swimmable {
    fun swim() {
        println("Я плыву.")
    }
}

interface Flyable {
    fun fly() {
        println("Я лечу")
    }

}

class Carp : Swimmable {
    init {
        println("Я карась.")
        swim()
        println()
    }
}

class Seagull : Flyable, Swimmable {
    init {
        println("Я чайка.")
        swim()
        fly()
        println()
    }
}

class Duck : Flyable, Swimmable {
    init {
        println("Я утка.")
        swim()
        fly()
    }
}

fun main() {
    val carp = Carp()
    val seagull = Seagull()
    val duck = Duck()
}