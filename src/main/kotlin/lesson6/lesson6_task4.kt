package lesson6

fun main() {
    var tryCount = 5
    var didNotWin = true
    val number = (1..9).random()
    while (tryCount > 0 && didNotWin) {
        --tryCount
        print("Попытка ${5 - tryCount}. Введите число: ")
        if (readln().toInt() == number) {
            didNotWin = false
            println("Это была великолепная игра!")
        }
    }
    if (didNotWin && tryCount == 0) {
        println("Было загадано число $number")
    }
}