package lesson1

fun main(){
    val secondsInSpace = 6480
    val secondsInHour = 3600
    val secondsInMinutes = 60

    val hour = secondsInSpace / secondsInHour
    val min = secondsInSpace % secondsInHour / secondsInMinutes
    val seconds = secondsInSpace % secondsInMinutes

    println("Время в космосе - ${String.format("%02d:%02d:%02d", hour, min, seconds)}")
}