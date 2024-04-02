package lesson18

class Parcel(val volume: Int)

class Box {
    fun volumeCalc(length: Int): Int {
        return length * length * length
    }

    fun volumeCalc(length: Int, height: Int, width: Int): Int{
        return length * height * width
    }
}


fun main() {
    val parcel1 = Parcel(volume = Box().volumeCalc(length = 10))
    val parcel2 = Parcel(volume = Box().volumeCalc(10, 12, 15))
    println(parcel1.volume)
    println(parcel2.volume)
}