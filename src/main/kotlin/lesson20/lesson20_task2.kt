package lesson20

class Player(val name: String, var currentHealth: Int) {
    val maxHealth = 100
    fun printHealthStat(){
        println("Your health is $currentHealth, Senior $name.")
    }
}

fun main() {
    val healthPotionValue = 25
    val drinkHealingPotion = {player: Player ->
        player.currentHealth += healthPotionValue
        if (player.currentHealth > player.maxHealth) player.currentHealth = player.maxHealth
        println("${player.name} found a Healing Potion, and enjoying it.")
    }
    val player = Player(name = "Don Quijote", currentHealth = 50)
    drinkHealingPotion(player)

    player.printHealthStat()

}