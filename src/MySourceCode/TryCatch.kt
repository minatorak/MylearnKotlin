package MySourceCode

fun main(args: Array<String>) {
    try {
        println("Enter number 0")
        val n:Int= readLine()!!.toInt()
        val div = 100/n

        println("Div = $div")
    }catch (e:Exception){//Exception (kotlin)
        println(e.message)
    }

    println(" done ")


}