package MySourceCode.ClassObj

fun main(args: Array<String>) {
//    testConOverload()
    testCons()
}

fun testCons() {
    val a = Cons(1)
//    Init block
//    Constructor
}

fun testConOverload() {
    var obj = Constructor_Overloading(name = "Superman")
    println(obj.name)
    println(obj.lastName)

}
