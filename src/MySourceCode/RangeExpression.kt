package MySourceCode

fun main(args: Array<String>) {

    for (i in 1..8){
        println(i)
    }

    for (i in 6 downTo 0 step 2){
        println(i)
    }

    val x:IntArray = intArrayOf(1,2,3,1,2)

    println("indices")
    for (i in x.indices){
        println(i)
    }
    println("index , val")
    for ((index,value) in x.withIndex()){
        println("index $index <--> $value")
    }

    println("map array")
    val xx = mapOf("a" to 3,"c" to 4,"b" to 2,"d" to 1)
    for ((val1,val2) in xx){
        println("val1 = $val1 , val2 = $val2")
    }


}
