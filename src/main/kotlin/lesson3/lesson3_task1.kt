package lesson3

fun main(){
    val goodMorning = "Доброе утро,"
    val goodEvening = "Добрый вечер,"

    val userName = "Иван"

    var greeting = "$goodMorning $userName."
    println(greeting)

    greeting = "$goodEvening $userName."
    println(greeting)
}
