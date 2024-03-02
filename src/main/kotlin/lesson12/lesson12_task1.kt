package lesson12

class DailyWeather {
    private var dayTemp: Int = 12
    fun setDayTemp(temp: Int) {
        dayTemp = temp
    }

    private var nightTemp: Int = 8
    fun setNightTemp(temp: Int) {
        nightTemp = temp
    }

    private var isPrecipitation = true
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

    val monday = DailyWeather()
    val tuesday = DailyWeather()
    monday.setDayTemp(22)
    monday.setNightTemp(18)
    monday.setPrecipitation(false)
    tuesday.setDayTemp(21)
    tuesday.setNightTemp(18)
    tuesday.setPrecipitation(true)
    monday.showDayWeather()
    tuesday.showDayWeather()
}