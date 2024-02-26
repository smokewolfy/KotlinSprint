package lesson11

class Room(
    private val label: String,
    private val roomName: String,
    private val userList: MutableList<User> = mutableListOf(),
    private val voiceStateList: List<String> = listOf("speak", "mic off", "muted user"),
) {
    fun addUser(avatar: String, name: String) {
        userList.add(User(userAvatar = avatar, userName = name, voiceState = voiceStateList[1]))
    }

    fun updateState(userIndex: Int, stateIndex: Int) {
        userList[userIndex].voiceState = voiceStateList[stateIndex]
    }

    fun showUserInfo(index: Int) {
        userList[index].userInfo()
    }

}

class User(
    private val userAvatar: String,
    private val userName: String,
    var voiceState: String
) {
    fun userInfo() {
        println(
            """$userAvatar
            |$userName
            |$voiceState
        """.trimMargin()
        )
    }
}

fun main() {
    val room1 = Room(label = "label1", roomName = "room name1")
    room1.addUser(avatar = "avatar1", name = "name1")
    room1.showUserInfo(index = 0)
    println()
    room1.addUser(avatar = "avatar2", name = "name2")
    room1.showUserInfo(1)
    println()
    val room2 = Room(label = "label2", roomName = "room name2")
    room2.addUser(avatar = "avatar3", name = "name3")
    room2.showUserInfo(index = 0)
    room2.updateState(userIndex = 0, stateIndex = 0)
    println()
    room2.showUserInfo(0)
}