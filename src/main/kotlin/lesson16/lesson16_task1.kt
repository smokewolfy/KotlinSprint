package lesson16

class Dice {
    private val dice = (1..6).random()
    fun getDiceSide(){
        println(dice)
    }
}

fun main() {
    val dice = Dice()
    dice.getDiceSide()
}