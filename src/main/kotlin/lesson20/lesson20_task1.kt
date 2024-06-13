package lesson20

fun main() {
    val congratulateStringCreator: (String) -> String
    congratulateStringCreator = { "С наступающим Новым Годом, $it!" }
    println(congratulateStringCreator("Jose"))
}