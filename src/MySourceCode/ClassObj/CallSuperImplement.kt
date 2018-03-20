package MySourceCode.ClassObj

open class FooLand {
    open fun f() {
        println("Base f fun")
    }

    open val x: Int get() = 1
}

class Bar : FooLand() {
    override fun f() {
        super.f()
        println("Bar f fun")
    }
    override val x: Int get() = super.x + 1
}

fun main(args: Array<String>) {
    var k = Bar()
    k.f()
    println(k.x)
}