package lesson15

abstract class BaseUser(
    protected val login: String,
    protected val password: String,
    protected val id: Int,
) {

    fun readForum(forumMessages: MutableList<String>) {
        println("Сообщения на форуме:")
        forumMessages.forEach { println(it) }
    }

    fun writeMessage(forumMessages: MutableList<String>, message: String) {
        println("$login пишет: $message")
        forumMessages.add("${login}: $message")
    }
}

class User(
    login: String,
    password: String,
    id: Int
) : BaseUser(login, password, id)

class Admin(
    login: String,
    password: String,
    id: Int
) : BaseUser(login, password, id) {
    fun deleteMessage(forumMessages: MutableList<String>, index: Int) {
        println("Андминистратор $login удаляет сообщение: ${forumMessages[index]}")
        forumMessages.removeAt(index)
    }
}


fun main() {
    val forumMessages: MutableList<String> = mutableListOf()
    val user = User(login = "Login", password = "password", id = 0)
    val admin = Admin(login = "Admin", password = "admin", id = 1)
    user.writeMessage(forumMessages, "Hello fellow")
    user.readForum(forumMessages)
    admin.deleteMessage(forumMessages, 0)

}
