package lesson2

import kotlin.math.pow

fun main(){
    val clientCash = 70_000
    val interestRate = 0.167
    val investmentYears = 20

    val investmentResult = clientCash * (1 + interestRate).pow(investmentYears)

    println(String.format("%.3f",investmentResult))
}