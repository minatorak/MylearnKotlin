package MySourceCode

open class MyOperations(){
    //set open class
    fun sum(n1:Int,n2:Int):Int{
        return n1+n2
    }
    fun div(n1:Int,n2:Int): Double {
        return (n1/n2)*1.0
    }

}
class MultiMyOperation():MyOperations(){
    fun sub(n1: Int,n2:Int):Int{
        return n1-n2
    }
    fun mul(n1:Int,n2:Int):Int{
        return n1*n2
    }
}

fun main(args: Array<String>) {
    val op = MyOperations()
    val sum = op.sum(10,5)
    println("sum :$sum")
    println("div :"+op.div(12,11))

    //second
    val op2 = MultiMyOperation()
    println("sum op2: "+op2.sum(11,12))
    println("sub op2:"+op2.sub(20,30))

}