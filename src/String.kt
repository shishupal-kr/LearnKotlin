fun main(){
    var name = "Shishupal"
    var name2 = "Shishupal"
    var name3 = "Rukkhi"

    println(name)
    println(name[1])
    println(name.length)
    println(name.toUpperCase())
    println(name.toLowerCase())
    println(name.trim())
    println(name.split(" "))
    println(name.replace("Shishupal","Rukkhi"))
    println(name.substring(0,5))
    println(name.substring(5,8))
    println(name.contains("Shi"))
    println(name.contains("pul"))

    println(name.indexOf("shu"))


    //compare
    println(name == name2)
    println(name == name3)
    println(name != name3)


}