package lesson14

class Chat() {
    private val messageList: MutableList<Message> = mutableListOf()
    private var messageID = 0
    fun addMessage(authorName: String, messageText: String) {
        messageList.add(Message(messageID++, authorName, messageText))
    }

    fun addThreadMessage(parentMessageID: Int, _authorName: String, _messageText: String) {
        messageList.add(
            ChildMessage(
                parentMessageID = parentMessageID,
                authorName = _authorName,
                messageText = _messageText,
                childMessageID = messageID++
            )
        )
    }

    fun printChat() {

        val chatView = messageList.groupBy(keySelector = { it.parentMessageID }, valueTransform =
        {
            if (it is ChildMessage) "\t${it.authorName}: ${it.messageText}\n"
            else
                "${it.authorName}: ${it.messageText}\n"
        })

        for (row in chatView.values) {
            for (column in row) {
                print(column)
            }
        }
    }


}


open class Message(
    internal val parentMessageID: Int,
    internal val authorName: String,
    internal val messageText: String,

    )

class ChildMessage(
    parentMessageID: Int,
    authorName: String,
    messageText: String,
    internal val childMessageID: Int

) :
    Message(
        parentMessageID,
        authorName,
        messageText,
    )

fun main() {
    val chat = Chat()
    chat.addMessage("Naruto", "Hi, everyone")
    chat.addThreadMessage(0, "TSUNADE", "Hi, Naruto")
    chat.addThreadMessage(0, "Naruto", "Hi, granny Tsunade")
    chat.addMessage("Naruto", "Saske, come back to konoha!")
    chat.addThreadMessage(1, "Saske", "No naruto")
    chat.addThreadMessage(0, "Naruto", "How are you doing?")
    chat.printChat()

}

