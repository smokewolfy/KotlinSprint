package lesson19

enum class HumanSex {
    MALE, FEMALE, UNKNOWN
}

class Human(
    private val name: String,
    private val sex: HumanSex,
){
    override fun toString(): String {
        return """Name: $name
            |Sex: $sex
        """.trimMargin()
    }
}

fun createContact(): Human {
    println("Enter name:")
    val name = readln()
    println(
        """Enter digit (means the sex) like this:
        |1(male)
        |2(female)
    """.trimMargin()
    )

    val sex = when (readln().toInt()) {
        1 -> HumanSex.MALE
        2 -> HumanSex.FEMALE
        else -> HumanSex.UNKNOWN
    }

    return Human(name = name, sex = sex)
}


fun main() {
    val cardList: MutableList<Human> = mutableListOf()
    repeat(5){
        cardList.add(createContact())
    }
    println("Card:")
    println(cardList.joinToString(separator = "\n\nCard:\n"))
}
