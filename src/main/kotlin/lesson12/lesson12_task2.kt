package lesson12

class DayWeather(private var dayTemp: Int, private var nightTemp: Int, private var isPrecipitation: Boolean) {

    fun showDayWeather(){
        println("""
            Today's temperature: $dayTemp
            Tonight's temperature: $nightTemp
            Precipitation till day: ${if (isPrecipitation) "Yes" else "No"}
        """.trimIndent())
    }
}


fun main() {
    val monday = DayWeather(25,20, false)
    monday.showDayWeather()

}
