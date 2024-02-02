package lesson2

fun main(){

    val departureHour = 9
    val departureMinute = 39
    val minutesInHour = 60
    val travelTime = 457

    val arrivalMinute = (departureMinute + travelTime) % minutesInHour
    val arrivalHour = departureHour + (departureMinute + travelTime) / minutesInHour

    println("Время прибытия - ${String.format("%02d:%02d", arrivalHour, arrivalMinute)}")
}