package lesson17

class Quiz(_question: String, _answer: String) {
    var question: String = _question
        get() = "Question - $field"

    var answer: String = _answer
        get() = "Your answer - $field"
        set(value) {
            field = value
        }
}