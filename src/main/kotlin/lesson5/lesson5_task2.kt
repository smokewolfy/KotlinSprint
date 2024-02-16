package lesson5

fun main() {
    print("Введите год рождения - ")
    val userBirthYear = readln().toInt()
    val currentYear = 2024
    val userAge = currentYear - userBirthYear

    val resultText = when {
        userAge >= AGE_OF_MAJORITY -> "Показать экран со скрытым контентом"
        userAge in FIRST_AGE_OF_PRE_MAJORITY..SECOND_AGE_OF_PRE_MAJORITY -> "Показать экран с ограниченным контентом"
        else -> "Вернуться на главный экран"
    }
    println(resultText)
}

const val FIRST_AGE_OF_PRE_MAJORITY = 16
const val SECOND_AGE_OF_PRE_MAJORITY = 17
const val AGE_OF_MAJORITY = 18