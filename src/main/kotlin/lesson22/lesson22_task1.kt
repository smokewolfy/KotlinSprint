package lesson22

class RegularBook(
    val title: String,
    val author: String,
)

data class DataBook(
    val title: String,
    val author: String,
)

fun main() {
    val regularOrwell1 = RegularBook("1984", "Gorge Orwell")
    val regularOrwell2 = RegularBook("1984", "Gorge Orwell")
    val dataOrwell1 = DataBook("1984", "Gorge Orwell")
    val dataOrwell2 = DataBook("1984", "Gorge Orwell")
    println(regularOrwell1.equals(regularOrwell2)) //обычный класс сравнивает ссылки на объекты,
    // поэтому результат сравнения false
    println(dataOrwell1.equals(dataOrwell2)) // data class сравнивает содержимое объектов,
    // поэтому резуьтат сравнения true
}