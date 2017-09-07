package MySourceCode

interface interfaceop{
    fun sum(n1:Int,n2:Int)
    fun div(n1:Int,n2:Int)
}

class Mop:interfaceop{
    override fun sum(n1: Int, n2: Int) {
        println("sum :"+(n1+n2))
    }

    override fun div(n1: Int, n2: Int) {
        println("div :"+(n1/n2))
    }
}

fun main(args: Array<String>) {
    val op = Mop()
    op.sum(10,20)
}