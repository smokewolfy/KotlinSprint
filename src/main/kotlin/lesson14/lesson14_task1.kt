package lesson14

open class Liner(
    private val name: String = "Лайнер",
    private val passengerCapacity: Int = 200,
    private val carrying: Int = 40,
    private val speed: Int = 20,
) {
    fun printShipCharacteristics() {
        println(
            "Характеристики корабля \"$name\":\n" +
                    "Количество пассажиров на корабле: $passengerCapacity чел.\n" +
                    "Грузоподьемность корабля: $carrying тонн\n" +
                    "Скорость корабля: $speed узлов\n"
        )
    }
    open fun printFunctionOfThisShip(){
        println("Везу людей отдыхать.\n")
    }
}


class CargoShip(
    name: String = "Грузовой",
    passengerCapacity: Int = 30,
    carrying: Int = 200,
    speed: Int = 18,
) : Liner(name, passengerCapacity, carrying, speed) {
    override fun printFunctionOfThisShip() {
        println("Везу грузы из Китая.\n")
    }
}

class IceBreaker(
    name: String = "Ледокол",
    passengerCapacity: Int = 40,
    carrying: Int = 20,
    speed: Int = 25
) : Liner(name, passengerCapacity, carrying, speed) {

    override fun printFunctionOfThisShip() {
        println("Колю лёд в океане.\n")
    }
    fun breakThroughTheIce() {
        println("Пробираюсь сквозь лёд.")
        println()
    }

}

fun main() {
    val liner = Liner()
    val cargoShip = CargoShip()
    val iceBreaker = IceBreaker()
    liner.printShipCharacteristics()
    liner.printFunctionOfThisShip()
    cargoShip.printShipCharacteristics()
    cargoShip.printFunctionOfThisShip()
    iceBreaker.printShipCharacteristics()
    iceBreaker.printFunctionOfThisShip()
    iceBreaker.breakThroughTheIce()
}