fun main(args: Array<String>) {
    var map= hashMapOf(1 to "Mil tank",2 to "King dra")
    map.put(3,"Unown")
    println(map.get(3))
    println(map[2])

    var ar= arrayOf(1,10,22,11)
    println(ar[0])

    var list = listOf(11,22,33,220)
//    list[0]=22
    var list2 = mutableListOf(11,20,30)
    list2[0]=123

    for (item in list){
        println(item)
    }
}