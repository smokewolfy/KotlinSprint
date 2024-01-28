package lesson3

fun main(){
    val name = "Татьяна"
    val patronymic = "Сергеевна"
    var surname = "Андреева"
    var age = 20
    println("""Фамилия: $surname
        |Имя: $name
        |Отчество: $patronymic
        |Возраст: $age
    """.trimMargin())

    surname = "Сидорова"
    age = 22
    println("""Фамилия: $surname
        |Имя: $name
        |Отчество: $patronymic
        |Возраст: $age
    """.trimMargin())


}