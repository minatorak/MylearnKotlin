package MySourceCode

fun main(args: Array<String>) {
    var map=HashMap<Int,String>()
    map.put(1,"Fu shi gi dane")
    map.put(2,"Hi to ka ge")
    map.put(33,"Ze ni ga me")
    println(map.get(33))
    
    for (k in map.keys){
        println(map.get(k))
    }

}