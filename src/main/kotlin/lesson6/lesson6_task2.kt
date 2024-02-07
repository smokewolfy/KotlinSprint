package lesson6

fun main() {
    print("Введите количество секунд: ")
    val inputSec = readln().toInt()
    var timer = inputSec
    while (timer > 0){
        println("Осталось ${timer--}")
        Thread.sleep(1000)
    }
    println("Прошло $inputSec секунд")
}