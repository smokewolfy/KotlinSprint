package lesson12

class Weather(_dayTemp: Float, _nightTemp: Float, _isPrecipitation: Boolean) {

    private var dayTemp: Int = (_dayTemp - 273.15).toInt()
    private var nightTemp: Int = (_nightTemp - 273.15).toInt()
    private var isPrecipitation = _isPrecipitation

    fun showDayWeather() {
        println(
            """
            Today's temperature: ${dayTemp}C
            Tonight's temperature: ${nightTemp}C
            Precipitation till day: ${if (isPrecipitation) "Yes" else "No"}
        """.trimIndent()
        )
    }
}

fun main() {
    val monday = Weather(300f, 280f, true)
    monday.showDayWeather()
}