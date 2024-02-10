package lesson7

fun main() {
    print("Введите число: ")
    val input = 0..readln().toInt()
    for (i in input step 2){
        println(i)
    }
}