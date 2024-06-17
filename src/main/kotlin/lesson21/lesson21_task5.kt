package lesson21

fun main() {
    val map = mapOf("Strength" to 10, "Power" to 105, "Speed" to 50, "Health" to 150, "Agility" to 150)
    println(map.maxCategory())
}

fun Map<String, Int>.maxCategory(): String {
    val name = this.maxBy { it.value }
    return name.key
}