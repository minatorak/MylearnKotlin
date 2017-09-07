package MySourceCode



open class opration4(){
    var name:String?=null
    constructor(name: String?) : this() {
        println("con opration4")
        this.name = name
    }
    open fun sum(n1:Int, n2:Int):Int{
        println("sum opration4")
        return n1+n2
    }
}
class Muopration4:opration4{
    constructor():super("Myname"){

    }
    override fun sum(n1:Int, n2:Int):Int{
        return super.sum(n1, n2)*3
    }

    fun mul(n1: Int,n2: Int): Int {
        return n1*n2
    }

}

fun main(args: Array<String>) {
    val op = Muopration4() as opration4
    println("sum :"+op.sum(2,2))
    println("opration4 name"+op.name)
//    println("mul :"+op.mul(3,4))
//    can not use .mul
}