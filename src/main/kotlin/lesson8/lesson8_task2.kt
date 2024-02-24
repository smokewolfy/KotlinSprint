package lesson8

fun main() {
    val recipe = arrayOf("egg", "powder", "sugar", "salt", "water")
    print("What ingredient you want to find? ")
    val ingredientForSearch = readln()
    for (i in recipe){
        if (i == ingredientForSearch){
            println("Ingredient $i is in recipe.")
            return
        }
    }
    println("This ingredient isn't in recipe")
}