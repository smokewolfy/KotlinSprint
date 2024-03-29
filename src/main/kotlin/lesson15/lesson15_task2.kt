package lesson15

abstract class WeatherStationStats(
    val amount: Int,
    val units: String,
)

class Temperature(
    amount: Int,
    units: String = "°C",
) : WeatherStationStats(amount, units)


class PrecipitationAmount(
    amount: Int,
    units: String = "mm",
) : WeatherStationStats(amount, units)


class WeatherServer {
    fun sendMessage(data: WeatherStationStats) {
        val output = "${data.amount}${data.units}"
        println(
            when (data) {
                is Temperature -> "Температура на улице: $output"
                is PrecipitationAmount -> "Выпало осадков: $output"
                else -> "Получены неизвестные данные."
            }
        )
    }
}

fun main() {
    val temperature = Temperature(22)
    val precipitationAmount = PrecipitationAmount(14)
    val weatherServer = WeatherServer()
    weatherServer.sendMessage(temperature)
    weatherServer.sendMessage(precipitationAmount)
}