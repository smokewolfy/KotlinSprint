package lesson4
const val ALL_TABLE_COUNT = 13
fun main() {

    val reservedTableForToday = 13
    val reservedTableForTomorrow = 9
    println("Доступность столиков на сегодня: ${ALL_TABLE_COUNT > reservedTableForToday}\n" +
            "Доступность столиков на завтра: ${ALL_TABLE_COUNT > reservedTableForTomorrow}")
    println()

}