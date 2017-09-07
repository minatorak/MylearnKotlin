package MySourceCode


open class opration3(){
    open fun sum(n1:Int, n2:Int):Int{
        return n1+n2
    }
}
class Muopration3:opration3{
    constructor():super(){

    }
    override fun sum(n1:Int, n2:Int):Int{
        return (n1+n2)*3
    }

    fun mul(n1: Int,n2: Int): Int {
        return n1*n2
    }

}

fun main(args: Array<String>) {
    var op = Muopration3() as opration3
    println("sum :"+op.sum(2,2))
//    println("mul :"+op.mul(3,4))
//    can not use .mul
}