package lesson4

fun main() {
    val allTableCount = 13
    var reservedTableForToday = 13
    var reservedTableForTomorrow = 9
    println("Доступность столиков на сегодня: ${allTableCount > reservedTableForToday}\n" +
            "Доступность столиков на завтра: ${allTableCount > reservedTableForTomorrow}")
    println()

}