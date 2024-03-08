package lesson14

import kotlin.math.pow

abstract class Figure(
    private val color: String,
) {
    fun getColor(): String {
        return color
    }

    abstract fun getPerimeter(): Double
    abstract fun getArea(): Double
}


class Circle(
    color: String,
    private val radius: Double,
) : Figure(color) {

    override fun getPerimeter(): Double {
        return 2 * Math.PI * radius
    }

    override fun getArea(): Double {
        return Math.PI * (radius * radius)
    }
}

class Square(
    color: String,
    private val sideLength: Double,
) : Figure(color) {
    private val sideCount = 4
    override fun getPerimeter(): Double {
        return sideLength * sideCount
    }

    override fun getArea(): Double {
        return sideLength.pow(2)
    }
}

fun main() {
    val figureList: MutableList<Figure> = mutableListOf(
        Square("black", 20.0),
        Square("white", 10.0),
        Circle("black", 10.0),
        Circle("white", 5.0)
    )
    println(
        "Black figures perimeter sum: ${
            figureList.filter { it.getColor() == "black" }.sumOf { it.getPerimeter() }
        }"
    )
    println("White figures area sum: ${
            figureList.filter { it.getColor() == "white" }.sumOf { it.getArea() }
        }"
    )

}