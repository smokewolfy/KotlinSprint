package lesson21

import java.io.File

fun main() {
    val file = File("words.txt")
    file.createNewFile()
    file.addWordOnTop("first")
    file.addWordOnTop("second")
    file.addWordOnTop("third")
}

fun File.addWordOnTop(word: String) {
    val text = this.readLines().joinToString("\n")
    this.writeText(word.lowercase())
    this.appendText("\n$text")
}