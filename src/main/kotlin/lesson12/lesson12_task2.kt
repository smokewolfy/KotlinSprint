package lesson12

class DailyWeather(private var dayTemp: Int, private var nightTemp: Int, private var isPrecipitation: Boolean) {

    fun setDayTemp(temp: Int) {
        dayTemp = temp
    }
    fun setNightTemp(temp: Int) {
        nightTemp = temp
    }
    fun setPrecipitation(isPrecipitation: Boolean) {
        this.isPrecipitation = isPrecipitation
    }
    fun showDayWeather(){
        println("""
            Today's temperature: $dayTemp
            Tonight's temperature: $nightTemp
            Precipitation till day: ${if (isPrecipitation) "Yes" else "No"}
        """.trimIndent())
    }
}


fun main() {
    val monday = DailyWeather(25,20, false)
    monday.showDayWeather()
    monday.setDayTemp(28)
    monday.setNightTemp(25)
    monday.setPrecipitation(false)
    monday.showDayWeather()

}