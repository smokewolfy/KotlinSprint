package lesson4

fun main() {
    print("Наличие повреждений корабля(true/false): ")
    val damage: Boolean = readln().toBoolean()

    print("Количество экипажа: ")
    val crew: Int = readln().toInt()

    print("Количество ящиков провизии: ")
    val foodBoxes:Int = readln().toInt()

    print("Погода благоприятна(true/false): ")
    val favorableWeather: Boolean = readln().toBoolean()

    val sailorable:Boolean = (IS_DAMAGED == damage) &&
            (MIN_CREW <= crew) && (crew <= MAX_CREW) &&
            (MIN_FOOD_BOXES <= foodBoxes) &&
            (FAVORABLE_WEATHER == favorableWeather)

    println("Возможность к отправлению: $sailorable")

}

const val IS_DAMAGED = false
const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_FOOD_BOXES = 50
const val FAVORABLE_WEATHER = true