package lesson18

class Screen {
    fun draw(figure: Figure, x: Int, y: Int) {
        println(figure.draw(x, y))
    }

    fun draw(figure: Figure, x: Float, y: Float) {
        println(figure.draw(x, y))
    }

}

abstract class Figure {
    abstract val figureName: String
    fun draw(x: Int, y: Int) = "$figureName($x, $y)"

    fun draw(x: Float, y: Float) = "$figureName($x, $y)"
}

class Point : Figure() {
    override val figureName = "Point"
}

class Square : Figure() {
    override val figureName: String = "Square"
}

class Circle : Figure() {
    override val figureName = "Circle"
}

fun main() {
    val screen = Screen()
    screen.draw(Square(), 0, 0)
    screen.draw(Square(), 5f, 5f)
    screen.draw(Point(), 10, 10)
    screen.draw(Point(), 15f, 15f)
    screen.draw(Circle(), 20, 20)
    screen.draw(Circle(), 25f, 25f)
}