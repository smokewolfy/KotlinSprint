package lesson6

fun main() {
    print("Введите количество секунд: ")
    val inputSec = readln().toLong()
    Thread.sleep(inputSec * 1000)
    println("Прошло $inputSec секунд")
}