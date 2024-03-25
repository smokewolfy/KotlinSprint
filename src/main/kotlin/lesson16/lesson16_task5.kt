package lesson16

class Hero(
    private val name: String,
    private var health: Int = 100,
    private var hitPower: Int,
) {
    private var isAlive = true

    fun getName(): String = name
    fun getAliveStatus(): Boolean = isAlive
    fun hit(): Int = (0..hitPower).random()

    fun heal() {
        if (health < 91  && isAlive) health += 10 else health = 100
    }

    fun getDamage(damageValue: Int) {
        health -= damageValue
        if (health <= 0) {
            dying()
        }
    }

    private fun dying() {
        health = 0
        hitPower = 0
        isAlive = false
        println("Wasted. $name is dead.")
    }
}

fun main() {
    val hero1 = Hero(name = "Shao Kahn", hitPower = 20)
    val hero2 = Hero("Liu Kang", hitPower = 20)
    println("Fight!")
    while (hero2.getAliveStatus() && hero1.getAliveStatus()) {
        hero1.getDamage(hero2.hit())
        if (hero2.getAliveStatus()) {
            hero2.getDamage(hero1.hit())
        }
        hero1.heal()
        hero2.heal()
    }
    val winnerName = if (hero1.getAliveStatus()) hero1.getName() else hero2.getName()
    println("$winnerName Wins.")
}