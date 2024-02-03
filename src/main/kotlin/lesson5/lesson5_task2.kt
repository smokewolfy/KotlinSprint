package lesson5

fun main() {
    print("Введите год рождения - ")
    val userBirthYear = readln().toInt()
    val currentYear = 2024
    val userAge = currentYear - userBirthYear

    val resultText = if (userAge >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом"
    else if (userAge == 16 || userAge == 17) "Показать экран с ограниченным контентом"
    else "Вернуться на главный экран"

    println(resultText)
}


const val AGE_OF_MAJORITY = 18