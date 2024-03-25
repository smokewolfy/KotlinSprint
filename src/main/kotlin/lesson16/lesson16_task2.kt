package lesson16

class Circle(private val radius: Float,){
    private val pi = 3.14f
    fun calcCircumference(): Float{
        return pi * radius * 2
    }
    fun calcAreaOfCircle(): Float{
        return pi * (radius * radius) * 2
    }

}

fun main() {
    val circle = Circle(7.0f)
    println("Длина окружности: ${circle.calcCircumference()}")
    println("Площадь окружности: ${circle.calcAreaOfCircle()}")
}