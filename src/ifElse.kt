fun main() {

    //if Else
    var a = 20
    var b = 10

    if (a > b) {
        println("a is greater than b")
    } else {
        println("b is greater than a")
    }

    //if Else Elseif
    var num = 20
    if (num > 10) {
        println("num is greater than 10")
    } else if (num < 10) {
        println("num is less than 10")
    } else {
        println("num is equal to 10")
    }

    //if else Expression, like ternary operator in Java
    var temp = 30
    var weather = if(temp > 20) {
        "Hot"
    } else {
        "Cold"
    }
    println(weather)


    //2nd way of using if else Expression
    val time = 20
    val greeting = if (time < 18) "Good day." else "Good evening."
    println(greeting)

}