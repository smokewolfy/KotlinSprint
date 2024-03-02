package lesson12

import kotlin.random.Random


class WeatherMaster(_dayTemp: Double, _nightTemp: Double, _isPrecipitation: Boolean) {

    private var dayTemp: Int = (_dayTemp - 273.15).toInt()
    fun getDayTemp(): Int {
        return dayTemp
    }

    private var nightTemp: Int = (_nightTemp - 273.15).toInt()
    fun getNightTemp(): Int {
        return nightTemp
    }

    private var isPrecipitation = _isPrecipitation
    fun getPrecipitation(): Boolean {
        return isPrecipitation
    }

}

fun main() {
    val weatherList: MutableList<WeatherMaster> = mutableListOf()
    val dayTempList: MutableList<Int> = mutableListOf()
    val nightTempList: MutableList<Int> = mutableListOf()
    val dailyPrecipitationList: MutableList<Boolean> = mutableListOf()
    for (i in 0..29) {
        val weather = WeatherMaster(
            Random.nextDouble(273.15, 310.0), Random.nextDouble(273.15, 310.0), Random.nextBoolean()
        )
        weatherList.add(
            weather
        )
        dayTempList.add(weather.getDayTemp())
        nightTempList.add(weather.getNightTemp())
        dailyPrecipitationList.add(weather.getPrecipitation())

    }

    println("Average temperature during the day in month: ${dayTempList.sum() / 30}C")
    println("Average temperature at night in month: ${nightTempList.sum() / 30}C")
    var daysWithPrecipitation = 0
    dailyPrecipitationList.map { if (it) ++daysWithPrecipitation }
    println("Days with precipitation: $daysWithPrecipitation")

}