package lesson4

fun main() {
    val isSunnyToday = true
    val tentIsOpenToday = true
    val humidityToday = 20
    val seasonToday = "Winter"
    println(favorable(isSunnyToday, tentIsOpenToday, humidityToday, seasonToday))

}

const val SKY_IS_SUNNY = true
const val TENT_IS_OPEN = true
const val FAVORABLE_HUMIDITY = 20
const val SEASON_TO_COMPARE = "Winter"

fun favorable(sun: Boolean, tentState: Boolean, humidityState: Int, season: String):String{
    return "Благоприятные ли условия сейчас для роста бобовых? " +
            "${(sun == SKY_IS_SUNNY) && 
                    (tentState == TENT_IS_OPEN) && 
                    (humidityState == FAVORABLE_HUMIDITY) &&
                    season != SEASON_TO_COMPARE
            }"
}