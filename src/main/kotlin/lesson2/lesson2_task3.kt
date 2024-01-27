package lesson2

fun main(){

    val departureHour = 9
    val departureMinute = 39

    val travelTime = 457

    val arrivalMinute = (departureMinute + travelTime) % 60
    val arrivalHour = departureHour + (departureMinute + travelTime) / 60

    println("Время прибытия - ${String.format("%02d:%02d", arrivalHour, arrivalMinute)}")
}