package lesson18

class ParcelInfoKeeper {
    val boxValuesList: MutableList<Int> = mutableListOf()
    fun addBoxValueToList(length: Int) {
        boxValuesList.add(SquareBox(length).volumeCalc())
    }

    fun addBoxValueToList(length: Int, height: Int, width: Int) {
        boxValuesList.add(RectangleBox(length, height, width).volumeCalc())
    }
}

abstract class Box {
    abstract fun volumeCalc(): Int
}

class SquareBox(
    private val length: Int,
) : Box() {
    override fun volumeCalc(): Int {
        return length * length * length
    }
}

class RectangleBox(
    private val length: Int,
    private val height: Int,
    private val width: Int,
) : Box() {
    override fun volumeCalc(): Int {
        return length * height * width
    }
}


fun main() {
    val parcelInfoKeeper = ParcelInfoKeeper()
    parcelInfoKeeper.addBoxValueToList(10)
    parcelInfoKeeper.addBoxValueToList(15, 20, 30)
    parcelInfoKeeper.boxValuesList.forEach{
        println(it)
    }
}