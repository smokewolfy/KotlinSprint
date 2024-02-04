package lesson5

fun main() {
    val firstNum = 15
    val secondNum = 33
    var guessCounter = 0

    println("Введите два разных числа от 0 до 42: ")
    val firstTry = readln().toInt()
    val secondTry = readln().toInt()
    val listOfPoints = listOf(2, 1, 0)

    if (firstTry == firstNum || firstTry == secondNum) guessCounter++

    if (secondTry == firstNum || secondTry == secondNum) guessCounter++

    when (guessCounter) {
        listOfPoints[0] -> println("Поздравляем! Вы выиграли главный приз!")
        listOfPoints[1] -> println("Вы выиграли утешительный приз!")
        listOfPoints[2] -> println("Неудача!")
    }
}