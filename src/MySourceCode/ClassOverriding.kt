package MySourceCode

open class MyOperations1(){
    //set open class and open fun
    open fun sum(n1:Int,n2:Int):Int{
        return n1+n2
    }
    fun div(n1:Int,n2:Int): Double {
        return (n1/n2)*1.0
    }

}
class MultiMyOperation1():MyOperations1(){
    fun sub(n1: Int,n2:Int):Int{
        return n1-n2
    }
    override fun sum(n1:Int, n2:Int):Int{
        return n1+n2*3
    }
    fun mul(n1:Int,n2:Int):Int{
        return n1*n2
    }
}

fun main(args: Array<String>) {
    val op = MyOperations1()
    val sum = op.sum(10,5)
    println("sum :$sum")
    println("div :"+op.div(12,11))

    //second
    val op2 = MultiMyOperation1()
    println("sum op2: "+op2.sum(11,12))
    println("sub*3 op2:"+op2.sub(10,5))
    println("mul op2:"+op2.mul(3,9))
}
