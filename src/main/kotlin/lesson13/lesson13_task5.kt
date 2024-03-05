package lesson13

class ContactMaster(_name: String, _phonenumber: Long, _company: String? = null) {
    private val name: String = _name
    private val phoneNumber: Long = _phonenumber
    private val company: String? = _company

    fun printContactInfo() {
        println("Name: $name")
        println("Phone number: $phoneNumber")
        println("Brand: ${company ?: "no info"}")
    }

}

fun main() {
    try {
        val contactMaster = ContactMaster(readln(), readln().toLong(), readln())
    } catch (e: Exception){
        println(e)
    }
}