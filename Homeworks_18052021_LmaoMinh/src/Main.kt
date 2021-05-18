package lmaominh

abstract class Champion {
    abstract var name : String
    abstract var hp : Int
    abstract var armor : Int
    abstract var resistance  : String

    fun introduce() = println("This is $name. He has 3 values about [HP, Armor, Resistance] are [$hp, $armor, $resistance]")
    fun qFunction() = println("$name is pressing Q button")
    fun wFunction() = println("$name is pressing W button")
    fun eFunction() = println("$name is pressing E button")
    fun rFunction() = println("$name is pressing R button")
}

class M4A1s() : Champion(){
    override var name : String = "M4A1s Champion"
    override var hp: Int = 25
    override var armor: Int = 75
    override var resistance: String = "2 taps at head"
}

class AK47() : Champion(){
    override var name : String = "AK47 Champion"
    override var hp: Int = 30
    override var armor: Int = 90
    override var resistance: String = "1 taps elite"
}

class AWP() : Champion(){
    override var name : String = "AWP Champion"
    override var hp: Int = 10
    override var armor: Int = 30
    override var resistance: String = "1 bullet 1 enemy"
}

class Deagle() : Champion(){
    override var name : String = "DE Champion"
    override var hp: Int = 7
    override var armor: Int = 35
    override var resistance: String = "AWP mini"
}

fun main() {
    println("WELCOME TO GAME LMAO MINH. THIS GAME COPIES LIEN^ QUAN^")
    println("===========================================")
    M4A1s().introduce()
    M4A1s().qFunction()
    M4A1s().wFunction()
    M4A1s().eFunction()
    M4A1s().rFunction()
    println("===========================================")
    AK47().introduce()
    AK47().qFunction()
    AK47().wFunction()
    AK47().eFunction()
    AK47().rFunction()
    println("===========================================")
    AWP().introduce()
    AWP().qFunction()
    AWP().wFunction()
    AWP().eFunction()
    AWP().rFunction()
    println("===========================================")
    Deagle().introduce()
    Deagle().qFunction()
    Deagle().wFunction()
    Deagle().eFunction()
    Deagle().rFunction()
}