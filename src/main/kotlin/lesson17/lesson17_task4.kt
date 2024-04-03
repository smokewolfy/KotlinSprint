package lesson17

class ParcelTracker(
    private val parcelID: Int,
    _currentLocation: String,
) {
    private var relocationCounter = 0
    var currentLocation = _currentLocation
        set(value) {
            field = value
            relocationCounter++
        }
}

fun main() {
    val parcelTracker = ParcelTracker(0, "Moscow")
    parcelTracker.currentLocation = "Lipeck"
    parcelTracker.currentLocation = "Voronezh"
}