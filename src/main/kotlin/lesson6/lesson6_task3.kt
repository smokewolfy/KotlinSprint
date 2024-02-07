package lesson6

fun main() {
    print("Введите количество секунд: ")
    var inputSec = readln().toInt()
    while (inputSec > 0){
        println("Осталось секунд: ${inputSec--}")
        Thread.sleep(1000)
    }
    println("Время вышло.")
}