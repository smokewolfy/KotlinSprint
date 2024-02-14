package lesson8

fun main() {
    val weekViewsPerDay = intArrayOf(305, 800, 1000, 608, 762, 901, 506)
    var allWeekViews = 0
    for (i in weekViewsPerDay) {
        allWeekViews += i
    }
    println("Ваши просмотры за день: $allWeekViews")
}