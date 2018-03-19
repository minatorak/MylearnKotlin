package MySourceCode

fun main(args: Array<String>) {
    val n1:Int=10
    val n2:Int?
    val n2Str:String="12"
    n2=n2Str.toInt()
    val n2Float:Float?
    n2Float=n2Str.toFloat()
    println("n1 "+n1)
    println("n2 "+n2)
    println("n2Float :$n2Float")

    val name = "pikacho"
    val people:List<String> = ArrayList()

    var Lo:Long = 2L
    Lo += 3 // Long + Int => Long

}