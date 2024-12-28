package oop

class car(var brand: String, var model: String, var year: Int){

    //function to start the car
    fun start(){
        println(brand +" Wroom! Wroom!")
    }
    fun stop(){
        println(brand +" is stopping!")
    }
}

fun main(){
    //creating object of Car class
    var c1 = car("BMW", "X5", 2021)
    var c2 = car("Audi", "Q7", 2020)


    //printing properties of Car class
    println(c1.brand)
    println(c2.model)
    println(c1.year)
    c1.start()
}