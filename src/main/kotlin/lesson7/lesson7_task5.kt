package lesson7

fun main() {
    // Определяем символы для пароля
    val intRange = '0'..'9'
    val upperCaseCharRange = 'A'..'Z'
    val lowerCaseCharRange = 'a'..'z'
    val passwordKeysList = listOf(intRange, upperCaseCharRange, lowerCaseCharRange)
    //Запрашиваем длину пароля
    print("Введите желаемую длинну пароля: ")
    val passwordSize = 10//readln().toInt()
    var password = ""

    //Уточняем инклюзивность всех трех видов символов
    val intCount = passwordSize / 3
    val upperCount = passwordSize / 3
    val lowerCount = passwordSize - (intCount + upperCount)
    println(upperCount)
    println(lowerCount)
    println(intCount)
    val listOfCharCountChance = mutableListOf(intCount, upperCount, lowerCount)
    val allCharCount = intCount + upperCount + lowerCount
    val difference = passwordSize - allCharCount

    for (step in passwordSize downTo 1) {
        val keyIndex = (0..passwordKeysList.size - 1).random()
        password += (passwordKeysList[keyIndex]).random()
    }
    println(password)

}