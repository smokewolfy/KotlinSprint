package lesson2

fun main(){
    val baffPercentage = 20
    val crystalOre = 7
    val ironOre = 11
    val devider = 100

    val baffCrystalOre: Int = (crystalOre * baffPercentage)/devider
    val baffIronOre: Int = (ironOre * baffPercentage)/devider

    println("Получено дополнительно кристаллической руды - $baffCrystalOre")
    println("Получено дополнительно железной руды - $baffIronOre")
}