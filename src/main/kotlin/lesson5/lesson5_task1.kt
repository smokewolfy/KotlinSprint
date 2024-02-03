package lesson5

fun main() {
    print("Решите пример: 12 * 12 = ")
    val input = readln().toInt()
    when (input) {
        144  -> println("Добро пожаловать!")
        else -> println("Доступ запрещен.")
    }
}