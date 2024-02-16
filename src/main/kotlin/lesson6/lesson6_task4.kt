package lesson6

fun main() {
    var tryCount = 5
    val number = (1..9).random()
    while (tryCount > 0) {
        --tryCount
        print("Попытка ${5 - tryCount}. Введите число: ")
        if (readln().toInt() == number) {
            println("Это была великолепная игра!")
            break
        }else{
            println("Неверно.")
        }
    }
    if (tryCount == 0) {
        println("Было загадано число $number")
    }
}