package question2

//Using constructor
class Dog( name : String,  age : Int,  color : String,  size : String){
    val nameDog : String = name
    val ageDog : Int = age
    val colorDog : String = color
    val sizeDog : String = size

    fun introduce (){
        println("This is $nameDog dog. It's $ageDog years old" +
                " with the color is $colorDog and the size is $sizeDog ")
    }

    fun bark(){
        println("$nameDog is barking")
    }

    fun eat(){
        println("$nameDog is eating")
    }

    fun sleep(){
        println("$nameDog is eating")
    }
}

//Install the var in the class
class Rifle{
    val name : String = "AK47"
    val ammo : String = "30/90"
    val damage : String = "1 tap 1 head"

    fun introduce(){
        println("This is $name with the ammo is $ammo. Its damage is $damage")
    }

    fun shoot(){
        println("$name is shooting: Doang` Doang` Doang` !!")
    }

    fun reaload(){
        println("$name is out of ammo. Reloading!!")
    }
}


fun main(){
    val ak47 = Rifle()
    ak47.introduce()
    ak47.shoot()
    ak47.reaload()

    ////////////////////////////////
    println("===================================")
    ////////////////////////////////

    val becgie = Dog("Becgie", 5, "yellow", "big")
    becgie.introduce()
    becgie.bark()
    becgie.eat()
    becgie.sleep()


}