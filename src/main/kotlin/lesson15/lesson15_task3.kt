package lesson15

abstract class BaseUser {
    abstract val login: String
    abstract val password: String
    abstract val id: Int
    fun readForum(forumMessages: MutableList<String>) {
        println("Сообщения на форуме:")
        forumMessages.forEach { println(it) }
    }

    fun writeMessage(forumMessages: MutableList<String>, message: String) {
        println("$login пишет: $message")
        forumMessages.add("${login}: $message")
    }
}

data class User(
    override val login: String,
    override val id: Int,
    override val password: String,
) : BaseUser()

data class Admin(
    override val login: String,
    override val id: Int,
    override val password: String,
) : BaseUser() {
    fun deleteMessage(forumMessages: MutableList<String>, index: Int) {
        println("Андминистратор $login удаляет сообщение: ${forumMessages[index]}")
        forumMessages.removeAt(index)
    }
}


fun main() {
    val forumMessages: MutableList<String> = mutableListOf()
    val user = User(login = "Login", 0, password = "password")
    val admin = Admin(login = "Admin", 1, password = "admin")
    user.writeMessage(forumMessages, "Hello fellow")
    user.readForum(forumMessages)
    admin.deleteMessage(forumMessages, 0)

}
