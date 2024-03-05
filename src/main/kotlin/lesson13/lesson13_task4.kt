package lesson13

class ContactKeeper(_name: String, _phonenumber: Long, _company: String? = null) {
    private val name: String = _name
    private val phoneNumber: Long = _phonenumber
    private val company: String? = _company

    fun printContactInfo() {
        println("Name: $name")
        println("Phone number: $phoneNumber")
        println("Brand: ${company ?: "no info"}")
    }

}

class Phone() {
    val phoneBook: MutableList<ContactKeeper> = mutableListOf()

    fun createContact(name: String, phoneNumber: String, company: String?) {
        if (phoneNumber.toPhoneNumberOrNull() != null) {
            phoneBook.add(ContactKeeper(name, phoneNumber.toLong(), company))
        } else {
            return
        }
    }
}

fun main() {

    val phone = Phone()
    phone.createContact(readln(), readln(), readln())
    phone.createContact(readln(), readln(), readln())
    phone.phoneBook.map { it.printContactInfo() }

}


fun String.toPhoneNumberOrNull(): Long? {
    return if (this.toLongOrNull() != null && this.length == 11) {
        this.toLong()
    } else {
        println("Number is not valid.")
        null
    }
}