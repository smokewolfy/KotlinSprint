package lesson9

fun main() {
    println("Введите 5 ингредиентов: ")
    var list: MutableList<String> = mutableListOf()
    repeat(5) { list.add(readln()) }
    list = list
        .sorted()
        .joinToString(separator = " ")
        .capitalize()
        .split(" ")
        .toSet()
        .toMutableList()
    println(list.joinToString(separator = ", "))
}