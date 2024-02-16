package lesson8

fun main() {
    print("Введите количество элементов: ")
    val array = Array<String>(readln().toInt()) { "" }
    for (i in array) {
        print("Введите элемент №${array.indexOf(i) + 1}: ")
        array.set(array.indexOf(i), readln())
    }
    println("Ваш массив: " + array.joinToString())
}