package lesson13

class SmartPhonebook(_name: String, _phonenumber: Long, _brand: String? = null) {
    private val name: String = _name
    private val phoneNumber: Long = _phonenumber
    private val brand: String? = _brand

    fun printContactInfo() {
        println("Name: $name")
        println("Phone number: $phoneNumber")
        println("Brand: ${brand ?: "no info"}")
    }
}

fun main() {
    val contact = SmartPhonebook(_name = "Коля", _phonenumber = 89009009090)
    contact.printContactInfo()
}

