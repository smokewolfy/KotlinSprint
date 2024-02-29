package lesson11


class Forum {
    private val userList: MutableList<ForumUser> = mutableListOf()
    private val messageList: MutableList<ForumMessage> = mutableListOf()
    private var userCount: Int = 0

    fun createNewUser(inputUserName: String): ForumUser {
        val user = ForumUser()
        user.userName = inputUserName
        userList.add(user)
        user.userID = userCount++
        return user
    }

    fun createNewMessage(authorID: Int, inputMessage: String) {

        for (i in userList) {
            if (i.userID == authorID) {
                val message = ForumMessage()
                message.message = "${userList[authorID].userName}: $inputMessage"
                messageList.add(message)
                message.authorID = authorID
                break
            }
        }
    }

    fun printThread() {
        for (i in messageList) {
            println(i.message)
        }
    }
}

class ForumUser {
    internal var userID: Int = 0
    internal var userName: String = ""
}


class ForumMessage {
    internal var authorID: Int = 0
    internal var message: String = ""
}

fun main() {
    val forum = Forum()
    forum.createNewUser("Uzumaki Naruto")
    forum.createNewUser("Uchiha Sasuke")
    forum.createNewMessage(0, "Sasuke! Come back to village!!!")
    forum.createNewMessage(1, "DATTEBAYO!")
    forum.createNewMessage(1, "No, Naruto!")
    forum.printThread()

}