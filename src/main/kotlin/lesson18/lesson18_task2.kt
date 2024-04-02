package lesson18

abstract class Dice {
    open val maxDiceValue = 8
    open fun throwDice(): Int = (MIN_DICE_VALUE..maxDiceValue).random()
}

class FourGradeDice : Dice() {
    override val maxDiceValue: Int = 4
}

class SixGradeDice : Dice() {
    override val maxDiceValue: Int = 6
}

class EightGradeDice : Dice()

fun main() {
    val diceList: List<Dice> = listOf(FourGradeDice(), SixGradeDice(), EightGradeDice())
    diceList.forEach {
        println(it.throwDice())
    }
}

const val MIN_DICE_VALUE = 1