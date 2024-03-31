package lesson18

open class Dice{
    open fun throwDice(): Int = 0
}

class FourGradeDice: Dice(){
    override fun throwDice(): Int {
        return (1..4).random()
    }
}

class SixGradeDice: Dice(){
    override fun throwDice(): Int {
        return (1..6).random()
    }
}

class EightGradeDice:Dice(){
    override fun throwDice(): Int {
        return (1..8).random()
    }
}

fun main() {
    val diceList: List<Dice> = listOf(FourGradeDice(), SixGradeDice(), EightGradeDice())
    diceList.forEach{
        println(it.throwDice())
    }
}
