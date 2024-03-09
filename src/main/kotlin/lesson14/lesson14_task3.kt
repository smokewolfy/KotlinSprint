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
        Square(Colours.BLACK.color, 20.0),
        Square(Colours.WHITE.color, 10.0),
        Circle(Colours.BLACK.color, 10.0),
        Circle(Colours.WHITE.color, 5.0)
    )
    println(
        "Black figures perimeter sum: ${
            figureList.filter { it.getColor() == Colours.BLACK.color }.sumOf { it.getPerimeter() }
        }"
    )
    println("White figures area sum: ${
            figureList.filter { it.getColor() == Colours.WHITE.color }.sumOf { it.getArea() }
        }"
    )

}

enum class Colours(val color: String){
    WHITE("white"),
    BLACK("black"),

}