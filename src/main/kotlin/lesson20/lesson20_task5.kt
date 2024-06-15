package lesson20

class Robot() {
    private val speechList = listOf("I am robot.", "Yes, I do.", "Yes, I can.", "No, I don't.", "No, I can't.")
    fun say(isReversed: Boolean) {
        println(modifier(speechList.random(), isReversed))

    }

    private val modifier: (String, Boolean) -> String =
        { speech: String, isReversed: Boolean -> if (isReversed) speech.reversed() else speech }

}


fun main() {
    val robot = Robot()
    robot.say(true)
}