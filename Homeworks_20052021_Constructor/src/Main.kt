package constructor

abstract class Animal() {
    abstract val name : String
    abstract val numberOfLegs : Int
    abstract val color : String

    abstract fun introduce()
    abstract fun makesound()
    abstract fun action()
}

class Dog(name : String, numberLegs: Int, color : String) : Animal()  {
    override val name = "Becgie"
    override val numberOfLegs = 4
    override val color = "Yellow"
    var age : Int = 0
        get() = field
        set(value) {
            field = if (age < 10)
                18
            else
                value
        }

    constructor() : this("Becgie", 4, "Yellow")
    constructor(nameAnimal: String,  numberLegs: Int) : this("Becgie", 4, "Yellow")
    constructor(nameAnimal: String) : this("Becgie", 4, "Yellow")

    override fun introduce() {
        println("This is $name dog.It has $numberOfLegs legs with $color color ")
    }

    override fun makesound() {
        println("$name is barking gow gow gow!")
    }

    override fun action() {
        println("$name is running")
    }

    companion object {
        const val friend : String = "Zetsu"
    }

}

class Cat() : Animal() {
    override val name = "M9 Bayonet"
    override val numberOfLegs = 4
    override val color = "Fade"

    override fun introduce() {
        println("This is $name cat. It has $numberOfLegs legs with  $color color ")
    }

    override fun makesound() {
        println("$name sounds meow meow!")
    }

    override fun action() {
        println("$name is jumping and hunting mouse")
    }

}

class Duck() : Animal() {
    override val name = "Donal"
    override val numberOfLegs = 2
    override val color = "White"

    override fun introduce() {
        println("This is $name duck. It has $numberOfLegs legs with $color color ")
    }

    override fun makesound() {
        println("$name sounds quec quec!")
    }

    override fun action() {
        println("$name is swimming")
    }
}

class Pig() : Animal() {
    override val name = "Lmao"
    override val numberOfLegs = 4
    override val color = "Pink"

    override fun introduce() {
        println("This is $name pig. It has $numberOfLegs legs with  $color color ")
    }

    override fun makesound() {
        println("$name sounds ec ec!")
    }

    override fun action() {
        println("$name is sleeping")
    }

}


fun main(){
    val dog =  Dog()
    val dog2 = Dog.Companion
    dog.age = 5
    dog.introduce()
    println( "It's ${dog.age} years old.")
    dog.makesound()
    dog.action()
    println("Its friend is ${dog2.friend}")
    println("========================================")
    val cat =  Cat()
    cat.introduce()
    cat.makesound()
    cat.action()
    println("========================================")
    val duck =  Duck()
    duck.introduce()
    duck.makesound()
    duck.action()
    println("========================================")
    val pig =  Pig()
    pig.introduce()
    pig.makesound()
    pig.action()
    println("========================================")

}