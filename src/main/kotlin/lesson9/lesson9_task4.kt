package lesson9

fun main() {
    print("Введите 5 названий ингредиентов через запятую и пробел: ")
    val ingredientList = readln().split(", ").sorted()

    println(ingredientList)
}