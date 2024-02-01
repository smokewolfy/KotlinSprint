package lesson4
const val allTableCount = 13
fun main() {

    val reservedTableForToday = 13
    val reservedTableForTomorrow = 9
    println("Доступность столиков на сегодня: ${allTableCount > reservedTableForToday}\n" +
            "Доступность столиков на завтра: ${allTableCount > reservedTableForTomorrow}")
    println()

}