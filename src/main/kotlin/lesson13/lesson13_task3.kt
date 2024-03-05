package lesson13

class Contact(_name: String, _phonenumber: Long, _company: String? = null) {
    private val name: String = _name
    private val phoneNumber: Long = _phonenumber
    private val company: String? = _company

    fun getCompany(): String? {
        return company
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
    val contactsWithCompany = phonebook.mapNotNull { it.getCompany() }
    contactsWithCompany.map { println(it) }
}

