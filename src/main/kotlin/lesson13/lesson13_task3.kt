package lesson13

class Contact(_name: String, _phonenumber: Long, _brand: String? = null) {
    private val name: String = _name
    private val phoneNumber: Long = _phonenumber
    private val brand: String? = _brand

    fun printContactInfo() {
        println("Name: $name")
        println("Phone number: $phoneNumber")
        println("Brand: ${brand ?: "no info"}")
    }

    fun getBrand(): String {
        return brand ?: ""
    }
}

fun main() {
    val phonebook: MutableList<Contact> = mutableListOf(
        Contact("Petya", 89008003535),
        Contact("Seryoja", 89018003535, "null"),
        Contact("Vasiliy", 89028003535),
        Contact("John Doe", 88002000600, "Natyajnie Potolki SPB"),
        Contact("Dexter Morgan", 13056868544, "Miami Police Department")
    )
    phonebook.map { if (it.getBrand().isNotEmpty()) println(it.getBrand()) }
}

