package lesson17

class ParcelTracker(
    private val parcelID: Int,
    _currentLocation: String,
    private val destinationPoint: String,
) {
    var currentLocation = _currentLocation
        set(value) {
            field = value
            println(
                if (field == destinationPoint)
                    "Посылка прибыла в пункт назначения: $destinationPoint"
                else
                    "Посылка прибыла в пункт: $field"
            )
        }
}

fun main() {
    val parcelTracker = ParcelTracker(0, "Moscow", "Voronezh")
    parcelTracker.currentLocation = "Lipeck"
    parcelTracker.currentLocation = "Voronezh"
}