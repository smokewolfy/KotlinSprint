package lesson20

fun main() {
    val congratulateStringCreator = {username: String -> "С наступающим Новым Годом, $username!"}(readln())
    println(congratulateStringCreator)
}