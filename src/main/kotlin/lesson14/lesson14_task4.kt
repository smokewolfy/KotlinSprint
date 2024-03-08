package lesson14

abstract class AstronomicalBody(
    private val name: String,
    private val hasAtmosphere: Boolean,
    private val isPossibleToLand: Boolean,
) {
    fun getName(): String {
        return name
    }
}

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    isPossibleToLand: Boolean,
) : AstronomicalBody(name, hasAtmosphere, isPossibleToLand) {

    private var satelliteList: MutableList<Satellite> = mutableListOf()
    fun getSatelliteList(): MutableList<Satellite> {
        return satelliteList
    }

    constructor(
        name: String,
        hasAtmosphere: Boolean,
        isPossibleToLand: Boolean,
        satelliteList: MutableList<Satellite>
    ) : this(name, hasAtmosphere, isPossibleToLand) {
        this.satelliteList = satelliteList
    }

}

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    isPossibleToLand: Boolean,
) :
    AstronomicalBody(name, hasAtmosphere, isPossibleToLand)

fun main() {
    val planet = Planet(
        "Mars", hasAtmosphere = false, isPossibleToLand = true,
        satelliteList = mutableListOf(
            Satellite("Deimos", hasAtmosphere = false, isPossibleToLand = false),
            Satellite("Phobos", hasAtmosphere = false, isPossibleToLand = false)
        )
    )
    val satelliteList = planet.getSatelliteList().map { it.getName() }
    print("Planet - ${planet.getName()}, it has satellite: ${satelliteList.joinToString(separator = ", ")}.")

}