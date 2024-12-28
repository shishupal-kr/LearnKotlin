package oop

class Car {
    var brand = ""
    var model = ""
    var year = 0
    var color = ""

    //function to start the car
    fun start(){
        println(brand +" is starting..")
    }
    fun stop(){
        println(brand +" is stopping!")
    }
}

fun main(){
    //creating object of Car class
    var c1 = Car()
    var c2 = Car()

    //assigning values to the properties of Car class
    c1.brand = "BMW"
    c1.model = "X5"
    c1.year = 2021
    c1.color = "Black"

    c2.brand = "Audi"
    c2.model = "Q7"
    c2.year = 2020
    c2.color = "UltraMarine Blue"

    //printing the values of the properties of Car class
    println(c1.brand)
    println(c2.color)
    println(c1.start())
    println(c2.stop())
}