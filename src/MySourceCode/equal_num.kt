package MySourceCode

fun main(args: Array<String>) {
    val a: Int = 10000
    println(a == a)
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println(boxedA === anotherBoxedA)

    println(boxedA == anotherBoxedA)

    val boxedAb: Int = a
    val anotherBoxedAb: Int = a
    println(boxedAb === anotherBoxedAb)
    println(boxedAb == anotherBoxedAb)

    val nb: Byte = 1
    val ni: Int = nb.toInt()

}

//trueRR
//false
//true
//true
//true
