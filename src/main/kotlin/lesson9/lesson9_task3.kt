package lesson9

fun main() {
    val ingredientValue = intArrayOf(2, 50, 15)
    print("Enter the number of servings: ")
    val servingsCount = readln().toInt()
    val valueForChosenServings = ingredientValue.map { it * servingsCount }


    println("For $servingsCount servings you need: Eggs - ${valueForChosenServings[0]}, milk - ${valueForChosenServings[1]}, butter - ${valueForChosenServings[2]}")
}