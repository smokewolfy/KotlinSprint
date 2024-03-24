package lesson15

interface Driveable {
    fun drive()
}

interface CargoTransportable {
    var cargoWeight: Int
    fun cargoLoading(cargoWeightToLoad: Int)

    fun cargoUnloading(cargoWeightToUnload: Int)
}

interface PassengersTransportable {
    var passengersCount: Int
    fun embark(passengersToEmbark: Int)
    fun disembark(passengersToDisembark: Int)
}

class Car : Driveable, PassengersTransportable {
    private val vehicleType = "Легковой автомобиль"
    override var passengersCount: Int = 0
    override fun drive() {
        println("$vehicleType выехал по назначению.")
        Thread.sleep(1000)
        println("$vehicleType прибыл.")
    }

    override fun embark(passengersToEmbark: Int) {
        println("Производится посадка пассажиров.")
        Thread.sleep(1000)
        if (passengersCount + passengersToEmbark <= MAX_PASSENGER_COUNT_IN_CAR) {
            passengersCount += passengersToEmbark
        } else {
            passengersCount = MAX_PASSENGER_COUNT_IN_CAR
            println("Невозможно посадить больше $MAX_PASSENGER_COUNT_IN_CAR человек в машину.")
        }
        print("Готово. ")
        println("Село пассажиров - $passengersCount")

    }

    override fun disembark(passengersToDisembark: Int) {
        println("Производится высадка пассажиров.")
        Thread.sleep(1000)
        if (passengersCount >= passengersToDisembark) {
            passengersCount -= passengersToDisembark
        } else {
            println("Невозможно высадить больше пассажиров чем есть в машине. Будут высажены все.")
            passengersCount = 0
        }
        print("Готово. ")
        println(
            if (passengersCount == 0)
                "В машине не осталось пассажиров."
            else
                "В машине осталось $passengersCount."
        )
    }

}

class Truck : Driveable, PassengersTransportable, CargoTransportable {
    private val vehicleType = "Груовой автомобиль"
    override var cargoWeight = 0
    override var passengersCount = 0
    override fun drive() {
        println("$vehicleType выехал по назначению.")
        Thread.sleep(1000)
        println("$vehicleType прибыл.")
    }

    override fun embark(passengersToEmbark: Int) {
        println("Производится посадка пассажиров.")
        Thread.sleep(1000)
        if (passengersCount + passengersToEmbark <= MAX_PASSENGER_COUNT_IN_TRUCK) {
            passengersCount += passengersToEmbark
        } else {
            passengersCount = MAX_PASSENGER_COUNT_IN_TRUCK
            println("Невозможно посадить больше $MAX_PASSENGER_COUNT_IN_TRUCK человек в машину.")
        }
        print("Готово. ")
        println("Село пассажиров - $passengersCount")

    }

    override fun disembark(passengersToDisembark: Int) {
        println("Производится высадка пассажиров.")
        Thread.sleep(1000)
        if (passengersCount >= passengersToDisembark) {
            passengersCount -= passengersToDisembark
        } else {
            println("Невозможно высадить больше пассажиров чем есть в машине. Будут высажены все.")
            passengersCount = 0
        }
        print("Готово. ")
        println(
            if (passengersCount == 0)
                "В машине не осталось пассажиров."
            else
                "В машине осталось $passengersCount."
        )
    }

    override fun cargoLoading(cargoWeightToLoad: Int) {
        println("Начата погрузка $cargoWeightToLoad тонн груза.")
        Thread.sleep(1000)
        if (cargoWeight + cargoWeightToLoad <= MAX_CARGO_WEIGHT) {
            cargoWeight += cargoWeightToLoad
        } else {
            cargoWeight = MAX_CARGO_WEIGHT
        }
        print("Готово. ")
        println("Загружено $cargoWeight тонн груза.")
    }

    override fun cargoUnloading(cargoWeightToUnload: Int) {
        println("Начата выгрузка $cargoWeightToUnload тонн груза.")
        Thread.sleep(1000)
        if (cargoWeight >= cargoWeightToUnload) {
            cargoWeight -= cargoWeightToUnload
        } else {
            cargoWeight = 0
        }
        print("Готово. ")
        println(
            if (cargoWeight == 0) {
                "Кузов грузовика пустой."
            } else {
                "В кузове осталось $cargoWeight тонн груза."
            }
        )
    }

}

fun main() {
    val car = Car()
    car.embark(3)
    car.drive()
    car.disembark(3)
    println()
    car.embark(2)
    car.drive()
    car.disembark(2)
    println()
    val truck = Truck()
    truck.embark(1)
    truck.cargoLoading(2000)
    truck.drive()
    truck.disembark(1)
    truck.cargoUnloading(2000)


}

const val MAX_CARGO_WEIGHT = 2000
const val MAX_PASSENGER_COUNT_IN_TRUCK = 1
const val MAX_PASSENGER_COUNT_IN_CAR = 3