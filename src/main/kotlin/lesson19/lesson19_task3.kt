package lesson19

class Starship(private val name: String, private val weapon: String){
    fun flyOff(){
        //TODO Нужно прописать логику.
    }
    fun land(){
        TODO()
    }
    fun shootAsteroid(){
        TODO("Отсутствует логика стрельбы")
    }

}

fun main() {
    val starship = Starship("Лорд Солар Махариус", "Лазерная пушка")
    starship.land()
    starship.flyOff()
    starship.shootAsteroid()
}