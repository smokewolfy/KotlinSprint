package lesson5

fun main() {
    val firstNum = 12
    val secondNum = 12
    val result = firstNum * secondNum
    print("Решите пример: $firstNum * $secondNum = ")
    val input = readln().toInt()

    if (input == result) println("Добро пожаловать!") else println("Доступ запрещен.")

}