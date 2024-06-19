package lesson22

data class Animal(
    val name: String,
    val hasClaws: Boolean,
    val tailLength: Int,
)

fun main() {
    val frog = Animal("Pepe", false, 1)
    val (animalName, animalHasClaws, animalTailLength) = frog
    println(
        """Animal's name: $animalName. 
        |Animal has claws: $animalHasClaws.
        |Animal's tail length: $animalTailLength.
    """.trimMargin()
    )
}