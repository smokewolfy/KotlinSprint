package lesson11


class CategoryList(
    private val categoryList: MutableList<Category> = mutableListOf(
        Category(
            categoryShortDescription = "",
            categoryName = "Favorite",
            recipeList = mutableListOf(),
        )
    ),

    ) {
    fun addCategory(categoryShortDescription: String, categoryName: String) {
        categoryList.add(Category(categoryShortDescription, categoryName))
    }
}


class Category(
    private val categoryShortDescription: String,
    private val categoryName: String,
    val recipeList: MutableList<Recipe> = mutableListOf(),
) {
    fun addRecipe(recipeName: String,recipeDescription: String) {
        recipeList.add(
            Recipe(
                recipeName = recipeName ,
                recipeDescription = recipeDescription
            )
        )
    }
}

class Recipe(
    private val recipeName: String,
    private val ingredientList: MutableList<Ingredient> = mutableListOf(),
    private val recipeDescription: String,

    ) {
    ////////
    class Ingredient(
        val ingredientName: String,
        val ingredientValueType: String,
        var ingredientCount: Int,
    ) {

    }
    /////////

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

    fun showRecipe() {
        for (i in ingredientList) {
            println("${i.ingredientName}: ${i.ingredientCount} ${i.ingredientValueType}")
        }

    }
}


