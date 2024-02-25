package lesson11

class User2(
    private val id: Int,
    private val login: String,
    private var password: String,
    private val email: String,
    private var bio: String? = null,

    ) {

    fun editBio() {
        print("Enter your Bio: ")
        bio = readln()
        println()
    }

    fun changePassword() {
        print("Enter old password: ")
        val oldPassword = readln()
        if (oldPassword == password) {
            println("Correct.\nEnter new password: ")
            password = readln()
            println("New password is added.\n")
        } else {
            println("Password is wrong.\n")
        }
    }

    override fun toString(): String {
        return "id: $id\nlogin: " +
                "$login\npassword: $password\n" +
                "email: $email\n" +
                if (!bio?.trim().isNullOrEmpty()) "bio: $bio" else ""
    }


}

fun main() {
    val user1 = User2(id = 1, login = "login1", password = "password1", email = "1@1.com")
    user1.editBio()
    user1.changePassword()
    println(user1.toString())

}