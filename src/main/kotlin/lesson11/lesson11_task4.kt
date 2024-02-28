package lesson11


class Category(
    private val categoryShortDescription: String,
    private val categoryName: String,
    internal val recipeList: MutableList<Recipe> = mutableListOf(),
) {
    fun addRecipe(recipeName: String, recipeDescription: String) {
        recipeList.add(
            Recipe(
                recipeName = recipeName, recipeDescription = recipeDescription
            )
        )
    }
}

class Recipe(
    private val recipeName: String,
    private val ingredientList: MutableList<Ingredient> = mutableListOf(),
    private val recipeDescription: String,

    ) {

    fun addIngredient(ingredientName: String, ingredientValueType: String, ingredientCount: Int) {
        ingredientList.add(
            Ingredient(
                ingredientName = ingredientName,
                ingredientValueType = ingredientValueType,
                ingredientCount = ingredientCount
            )
        )
    }

    fun multiplyIngredientsCont(countMultiplier: Int) {
        for (i in ingredientList) {
            i.ingredientCount *= countMultiplier
        }
    }

    fun showRecipeIngredients() {
        for (i in ingredientList) {
            println("${i.ingredientName}: ${i.ingredientCount} ${i.ingredientValueType}")
        }
    }

    fun showRecipeDescription() {
        println(recipeDescription)
    }
}


class Ingredient(
    val ingredientName: String,
    val ingredientValueType: String,
    var ingredientCount: Int,
) {

}