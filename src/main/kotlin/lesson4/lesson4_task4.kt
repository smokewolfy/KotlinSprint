package lesson4

fun main() {
    var day = 5
    println("""
        Упражнения для рук:    ${IS_ODD == ((day % 2) != 0)}
        Упражнения для ног:    ${!IS_ODD == ((day % 2) != 0)}
        Упражнения для спины:  ${!IS_ODD == ((day % 2) != 0)}
        Упражнения для пресса: ${IS_ODD == ((day % 2) != 0)}
    
    """.trimIndent())

    day++

    println("""
        Упражнения для рук:    ${IS_ODD == ((day % 2) != 0)}
        Упражнения для ног:    ${!IS_ODD == ((day % 2) != 0)}
        Упражнения для спины:  ${!IS_ODD == ((day % 2) != 0)}
        Упражнения для пресса: ${IS_ODD == ((day % 2) != 0)}
    
    """.trimIndent())
}

const val IS_ODD = true