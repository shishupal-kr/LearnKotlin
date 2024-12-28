fun main(){
//The break statement is used to jump out of a loop.

    var i = 0
    while (i <= 5){
        if (i == 4){
            continue    //it will skip the 4 and continue with the next iteration
        }
        println(i)
        i++
    }


}


fun main2() {
    var j = 0
    while (j <= 5) {
       if (j == 4) {
          break    //it will break the loop when j is 4
     }
     println(j)
     j++
    }
}