fun main (){

    println("range")
    for (i in 1..5){
        println(i)
    }

    println("until")
    for (j in 1 until 5){
        println(j)
    }

  println("downTo")
    for (k in 5 downTo 1){
        println(k)
    }

    println("step")
    for (l in 1..10 step 3){
        println(l)
    }

    println("downTo step")
    for (m in 10 downTo 1 step 2){
        println(m)
    }

    println()
    for(z in 1..10){
        if (z == 5){
            break
        }
        println(z)
    }

}