package lesson4

fun main() {
    var weight = 20
    var value = 80
    average(weight, value)

    weight = 50
    value = 100
    average(weight, value)

}
fun average(weight: Int, value: Int){



    println( "Груз с весом $weight кг и объемом $value л соответствует категории 'Average': " +
            "${(MIN_WEIGHT <= weight) && (weight >= MAX_WEIGHT) && (value < MAX_VALUE)}\n")
}

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VALUE = 100