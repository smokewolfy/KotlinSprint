package lesson15

open class Product(val name: String, val count: Int)

interface Searchable {
    val accessoriesList: MutableList<Accessory>
    fun search(accessoryName: String) {
        println("Выполняется поиск...")
        Thread.sleep(3000)
        var accessoryCount = 0
        accessoriesList.forEach { if (it.name.lowercase() == accessoryName.lowercase()) accessoryCount = it.count }
        println("Готово.")
        println(
            if (accessoryCount == 0) "Такого товара нет в наличии."
            else "$accessoryName имеется в колличестве $accessoryCount штук."
        )
    }
}

class Instrument(
    name: String,
    count: Int,
) : Searchable, Product(name, count) {
    override val accessoriesList: MutableList<Accessory> = mutableListOf()
    fun addAccessory(name: String, count: Int) {
        accessoriesList.add(Accessory(name, count))
    }
}

class Accessory(name: String, count: Int) : Product(name, count)

fun main() {
    val instrument = Instrument(name = "guitar", count = 2)
    instrument.addAccessory("String", 8)
    instrument.search("string")

}
