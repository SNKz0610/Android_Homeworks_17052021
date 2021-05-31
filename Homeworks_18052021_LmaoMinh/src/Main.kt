package lmaominh

abstract class Champion {
    abstract var name: String
    abstract var hp: Int
    abstract var armor: Int
    abstract var resistance: String

    fun introduce() =
        println("This is $name. He has 3 values about [HP, Armor, Resistance] are [$hp, $armor, $resistance]")

    fun qFunction(q: String) = println("$name is pressing Q button to use $q skill")
    fun wFunction(w: String) = println("$name is pressing W button to use $w skill")
    fun eFunction(e: String) = println("$name is pressing E button to use $e skill")
    fun rFunction(r: String) = println("$name is pressing R button to use $r skill")
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
    M4A1s().qFunction("scream")
    M4A1s().wFunction("fast reloading")
    M4A1s().eFunction("save bullets")
    M4A1s().rFunction("disconnect")
    println("===========================================")
    AK47().introduce()
    AK47().qFunction("chiu")
    AK47().wFunction("khong choi LUL")
    AK47().eFunction("nen ko biet^' gi`")
    AK47().rFunction("chiu x2")
    println("===========================================")
    AWP().introduce()
    AWP().qFunction("game nhai lien quan")
    AWP().wFunction("game thoi trang")
    AWP().eFunction("lam trau?")
    AWP().rFunction("thay` giao ba")
    println("===========================================")
    Deagle().introduce()
    Deagle().qFunction("lien quan > LUL")
    Deagle().wFunction("Lmao minh")
    Deagle().eFunction("nhai skill cua dota")
    Deagle().rFunction("bat truoc y xi` cach build do` cua dota")
}