package lesson13

class ContactHolder(_name: String, _phoneNumber: Long, _company: String? = null) {
    private val name: String = _name
    private val phoneNumber: Long = _phoneNumber
    private val company: String? = _company

}

fun main() {
    try {
        val contactKeeper = ContactKeeper(_name = readln(), _phonenumber = readln().toLong(), _company = readln())
    }catch (e: NumberFormatException){
        println(e)
    }
}