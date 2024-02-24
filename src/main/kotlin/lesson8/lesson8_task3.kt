package lesson8

fun main() {
    val recipe = arrayOf("egg", "powder", "sugar", "salt", "water")
    print("What ingredient you want to find? ")
    val ingredientForSearch = readln()
    if (ingredientForSearch in recipe) {
        println("Ingredient $ingredientForSearch is in recipe.")
    } else {
        println("This ingredient isn't in recipe")
    }
}

