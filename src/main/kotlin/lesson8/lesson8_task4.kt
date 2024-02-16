package lesson8

fun main() {
    val recipe = arrayOf("egg", "powder", "sugar", "salt", "water")
    for (i in recipe) {
        println(i)
    }

    while (true) {
        print("What ingredient you want to change? ")
        val ingredientToChange = readln()
        if (ingredientToChange !in recipe) {
            println("$ingredientToChange is not in recipe.")
            continue
        } else {
            print("What ingredient you want to add? ")
            recipe.set(recipe.indexOf(ingredientToChange), readln())
        }
        break
    }

    println("Done! You save this recipe: ")
    for (i in recipe) {
        println(i)
    }
}




