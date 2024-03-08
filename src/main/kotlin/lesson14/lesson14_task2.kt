package lesson14

open class LinerShip(
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
                    "Скорость корабля: $speed узлов"
        )
        loading()
    }
    open fun loading(){
        println("Лайнер выдвигает горизонтальный трап со шкафута.\n")
    }
}


class Cargo(
    name: String = "Грузовой",
    passengerCapacity: Int = 30,
    carrying: Int = 200,
    speed: Int = 18,
) : LinerShip(name, passengerCapacity, carrying, speed) {
    override fun loading() {
        println("Грузовой корабль активирует погрузочный кран.\n")
    }
}

class IceBreakerShip(
    name: String = "Ледокол",
    passengerCapacity: Int = 40,
    carrying: Int = 20,
    speed: Int = 25
) : LinerShip(name, passengerCapacity, carrying, speed) {

    override fun loading() {
        println("Ледокол открывает ворота со стороны кормы.\n")
    }
}

fun main() {
    val linerShip = LinerShip()
    val cargo = Cargo()
    val iceBreakerShip = IceBreakerShip()
    linerShip.printShipCharacteristics()


    cargo.printShipCharacteristics()


    iceBreakerShip.printShipCharacteristics()


}