package lesson19

enum class ProductCategory(val categoryName: String) {
    CLOTHES("Одежда"),
    STATIONERY("Канцелярские товары"),
    OTHER("Разное")
}

class Product(private val name: String, private val id: Int, private val categoryName: ProductCategory) {
    override fun toString(): String {
        return "Товар: $name\nID: $id\nКатегория: ${
            when (categoryName) {
                ProductCategory.CLOTHES -> ProductCategory.CLOTHES.categoryName
                ProductCategory.STATIONERY -> ProductCategory.STATIONERY.categoryName
                else -> ProductCategory.OTHER.categoryName
            }
        }\n"
    }
}

fun main() {
    val pan = Product("Ручка", 1, ProductCategory.STATIONERY)
    println(pan.toString())
    val dress = Product("Платье", 2, ProductCategory.CLOTHES)
    println(dress.toString())
    val dogFood = Product("Собачий корм", 3, ProductCategory.OTHER)
    println(dogFood.toString())
}