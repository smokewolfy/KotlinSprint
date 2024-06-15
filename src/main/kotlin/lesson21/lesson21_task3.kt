package lesson21

class PlayMan(val name: String, var currentHealth: Int) {
    val maxHealth = 100
    fun printHealthStat(){
        println("Your health is $currentHealth, Senior $name.")
    }
}

fun PlayMan.isHealthy(): Boolean{
    return this.currentHealth == this.maxHealth
}