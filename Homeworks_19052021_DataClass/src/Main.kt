package dataclass


data class Champion(val name: String, val hp: Int, val armor: Int, val resistance: String)

enum class ChampionX(val nameX: String, val hpX: Int, val armorX: Int, val resistanceX: String) {
    AChampion("M4A1s", 30, 90, "tap at head")
}

fun Int.checkPrime(): Boolean {
    for (i in 2..this / 2) {
        if (this % i == 0) {
            return false
            break
        }
    }
    return true
}

fun main() {
    //Run data class
    val champion1 = Champion("M4a1s", 30, 90, "tap at head")
    println(champion1)

    val nameOfChampion1 = ChampionX.AChampion.nameX
    println(nameOfChampion1)

    val x: Int = 3
    val check: Boolean = x.checkPrime()
    if (check) {
        println("$x is a prime number.")
    } else {
        println("$x is not a prime number.")
    }
}