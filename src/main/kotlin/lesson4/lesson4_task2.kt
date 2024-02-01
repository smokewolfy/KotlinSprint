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

    val minWeight = 35
    val maxWeight = 100
    val maxValue = 100

    println( "Груз с весом $weight кг и объемом $value л соответствует категории 'Average': " +
            "${(minWeight <= weight) && (weight >= maxWeight) && (value < maxValue)}\n")
}