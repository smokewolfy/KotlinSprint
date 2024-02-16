package lesson6

fun main() {
    println("Докажите что вы не робот.")
    val firstNumber = (1..9).random()
    val secondNumber = (1..9).random()
    val result = firstNumber + secondNumber
    var guessesCount = 3
    while (guessesCount > 0) {
        guessesCount--
        print("Решите пример $firstNumber + $secondNumber = ")
        if (readln().toInt() == result) {
            println("Добро пожаловать!")
            break
        }
        if (guessesCount == 0){
            println("Доступ запрещен.")
        }
    }
}