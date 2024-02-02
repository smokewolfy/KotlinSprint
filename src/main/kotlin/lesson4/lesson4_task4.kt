package lesson4

fun main() {
    var day = 5
    var isOdd = day % 2 != 0
    println("""
        Упражнения для рук:    $isOdd
        Упражнения для ног:    ${!isOdd}
        Упражнения для спины:  ${!isOdd}
        Упражнения для пресса: $isOdd
    
    """.trimIndent())

    day++
    isOdd = day % 2 != 0
    println("""
        Упражнения для рук:    $isOdd
        Упражнения для ног:    ${!isOdd}
        Упражнения для спины:  ${!isOdd}
        Упражнения для пресса: $isOdd
    
    """.trimIndent())

}

