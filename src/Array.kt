fun main(){
    //To create an array, use the arrayOf() function, and
    // place the values in a comma-separated list inside it:

    var car = arrayOf("BMW", "Audi", "Hyundai", "Suzuki", "Kia")
    var num = arrayOf(1, 2, 3, 4, 5)

    //Access elements of array
    println(car[0])
    car[3] = "Mercedes"
    println(car[3])
    println(car.size) //size of the array
    println(car.lastIndex) //last index of the array
    println(car.indices) //indices of the array

    println()
    println("# Check if an element is in the array")
    if ("BMW" in car){
        println("Yes, BMW is in the car array.")
    } else {
        println("No, BMW is not in the car array.")
    }

    println()

    println("# for Loop through an array:")
    for (x in num){
        println(x)
    }

}