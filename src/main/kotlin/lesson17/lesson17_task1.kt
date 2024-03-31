package lesson17

class Quiz(_question: String, _answer: String) {
    var question: String = _question
        get() = field

    var answer: String = _answer
        get() = field
        set(value) {
            field = value
        }
}