package lesson22

import java.util.Date

data class GalacticGuide(
    val name: String,
    val description: String,
    val datetime: Date,
    val distance: Double,
)

fun main() {
    val alphaCentauri = GalacticGuide("Alpha Centauri", "Beautiful place", Date(), 4.367)
    println("""We in: ${alphaCentauri.component1()}.
        |Current date and time: ${alphaCentauri.component3()}.
        |What We found here: ${alphaCentauri.component2()}
        |Distance from Home: ${alphaCentauri.component4()} l.y.
    """.trimMargin())
}