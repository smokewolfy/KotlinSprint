package lesson20

fun main() {
    val list = listOf("Буря", "Мглою", "Небо", "Кроет", "Вихри", "Снежные", "Крутя")
    val lambdaList = list.map { s ->
        { println("Нажат элемент $s") }
    }
    for(i in 1 until lambdaList.size step 2){
        lambdaList[i].invoke()
    }
}

