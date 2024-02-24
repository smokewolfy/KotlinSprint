package lesson8

fun main() {
    print("Введите количество элементов: ")
    val array = Array<String>(readln().toInt()) { "" }
    for (i in array.indices) {
        print("Введите элемент №${i + 1}: ")
        array[i] = readln()
    }
    println("Ваш массив: " + array.joinToString())
}