package lesson22

class RegularBookKeeper(
    val title: String,
    val author: String,
)

data class DataBookKeeper(
    val title: String,
    val author: String,
)

fun main() {
    val regularBookKeeper = RegularBookKeeper("We", "Zamyatin")
    val dataBookKeeper = DataBookKeeper("We", "Zamyatin")
    println(regularBookKeeper) // print обычого класса выводит адрес и имя класса
    println(dataBookKeeper) // data class дает возможность вывести информацию о полях встроенным методом toString()
}