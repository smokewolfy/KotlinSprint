package lesson17

class Ship(
    _name: String,
    _averageSpeed: Int,
    _homePort: String,
) {
    var name = _name
        set(value) {
            println("Нельзя изменить имя корабля.")
        }
    val averageSpeed = _averageSpeed
    val homePort = _homePort
}


fun main() {
    val ship = Ship("Иван Крузенштерн", 30, "Морской порт Санкт-Петербург")
    ship.name = "Пятница"
    println(ship.name)
}