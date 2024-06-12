package lesson19

enum class BulletType(val strength: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
    NONE(0),
}


class Tank {
    private var bulletType = BulletType.NONE
    fun changeBullet(bulletName: String) {
        println("Changing bullet to $bulletName")
        bulletType = when (bulletName) {
            "blue" -> BulletType.BLUE
            "green" -> BulletType.GREEN
            "red" -> BulletType.RED
            else -> {
                println("This is not a bullet type");BulletType.NONE
            }
        }
    }

    fun shoot() {
        println("Tank has made ${bulletType.strength} damage.")
    }
}

fun main() {
    val usaTank = Tank()
    usaTank.shoot()
    usaTank.changeBullet("blue")
    usaTank.shoot()
    usaTank.changeBullet("green")
    usaTank.shoot()
    usaTank.changeBullet("red")
    usaTank.shoot()
    usaTank.changeBullet("black")
    usaTank.shoot()
}