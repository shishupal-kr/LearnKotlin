//Functions are used to perform certain actions, and they are also known as methods.

fun main (){
    println("Hello World")
    myfun()
    greet("Rukkhi")
    println(add(5, 6))
    println(sub(5))

    var result = div(10, 2) //or
    println(result)
}

fun myfun(){
    println("Hello Shishupal")
}

fun greet(Name : String){
    println("Hello $Name")
}

fun add(a: Int, b: Int){
    println(a+b)
}


fun sub (x: Int): Int{   //return type is Int
    return (x-1)
}

fun div(a: Int , b: Int) = a/b