package lesson2

fun main(){
    val baff = 0.2f
    val crystalOre = 7
    val ironOre = 11

    val baffCrystalOre: Int = (crystalOre * baff).toInt()
    val baffIronOre: Int = (ironOre * baff).toInt()

    println("Получено дополнительно кристаллической руды - $baffCrystalOre")
    println("Получено дополнительно железной руды - $baffIronOre")
}