package lesson5


fun main() {
    val gameRange = 0..42
    val secretNums = mutableListOf(gameRange.random())

    repeat(2) {
        var randomNumber = gameRange.random()
        while (secretNums.contains(randomNumber)) {
            randomNumber = gameRange.random()
        }
        secretNums.add(randomNumber)
    }

    print("Введите три числа от 0 до 42: ")
    val userInput = listOf(readln().toInt(), readln().toInt(), readln().toInt())
    val matchingList = secretNums intersect userInput
    val matchingCount = matchingList.size

    when (matchingCount) {
        3 -> println("Вы угадали все числа и выиграли джекпот")
        2 -> println("Вы угадали 2 числа и выграли крупный приз")
        1 -> println("Вы угадали одно число и выиграли утешительный приз")
        0 -> println("Вы не угадали ни одного числа")
    }
    println(matchingList)
}



