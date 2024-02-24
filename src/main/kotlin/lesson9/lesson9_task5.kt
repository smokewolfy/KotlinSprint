package lesson9

import java.util.*

fun main() {
    println("Введите 5 ингредиентов: ")
    var list: MutableList<String> = mutableListOf()
    repeat(5) { list.add(readln()) }
    list = list
        .sorted()
        .joinToString(separator = " ")
        .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        .split(" ")
        .toSet()
        .toMutableList()
    println(list.joinToString(separator = ", "))
}