package oop
//Use the open keyword in front of the superclass/parent,
// to make this the class other classes should inherit properties and functions from.
fun main(){

    var d1 = Dog()
    var a1 = Animal()

    println(d1.color)   //child class
    println(d1.breed)   //child class

    d1.eat()    //child class
    d1.sleep()  //child class
    d1.bark()   //child class

    a1.eat()    //parent class
    a1.sleep()  //parent class

}

//parent class
open class Animal{
    open var color = ""
    open var breed = ""
    open var age = 0

    open fun eat(){    //you have to open the function to override it in child class
        println("Animal is eating..")
    }

    open fun sleep(){
        println("Animal is sleeping..")
    }
}

//child class
class Dog: Animal(){

    override var color = "Brown"
    override var breed = "Labrador"
    override var age = 3

    override fun eat(){   //overriding the function of parent class
        println("Dog is eating..")
    }
    override fun sleep(){
        println("Dog is sleeping..")
    }

    fun bark(){   //function of child class
        println("Dog is barking..")
    }
}