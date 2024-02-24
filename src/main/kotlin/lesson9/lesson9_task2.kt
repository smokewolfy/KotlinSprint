package lesson9

fun main() {
    val recipe = mutableListOf("egg", "bread", "beacon")
    println("Main ingredients in recipe: $recipe")
    println("Do you want to add ingredient? (yes/no) ")
    val isChangingRecipe = readln() == "yes"
    if (isChangingRecipe) {
        println("What ingredient you want to add?")
        recipe.add(readln())
        println("The recipe now contains the following ingredients: $recipe ")
    }

}