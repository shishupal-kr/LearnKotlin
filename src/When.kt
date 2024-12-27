fun main (){
    val day = 4
    val result = when(day){
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid day")
    }
    println(result)

    //2nd example
    val num = 3
    when (num){
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        4 -> println("Four")
    }

}