package lesson9

fun main() {
    val recipe = listOf("Tomatoes", "salt", "pepper", "spaghetti", "meatballs")
    println("This ingredients is in recipe: ")
    recipe.forEach {
        println(it)
    }
}