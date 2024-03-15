package lesson15

interface Searchable {
    val accessoriesList: MutableList<Accessory>
    fun search(accessoryName: String){
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
    private val name: String,
    private val count: Int,
) : Searchable {
    override val accessoriesList: MutableList<Accessory> = mutableListOf()
    fun addAccessory(name: String, count: Int) {
        accessoriesList.add(Accessory(name, count))
    }



}

class Accessory(val name: String, val count: Int)

fun main() {
    val instrument = Instrument(name = "guitar", count = 2)
    instrument.addAccessory("String", 8)
    instrument.search("string")

}
