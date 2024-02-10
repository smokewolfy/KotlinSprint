package lesson7

fun main() {
    print("Введите количество секунд: ")
    val input = readln().toInt() downTo 0
    for (i in input) {
        Thread.sleep(1000)
        println("Осталось $i сек.")

    }
    println("Время вышло.")
}