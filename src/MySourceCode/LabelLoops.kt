package MySourceCode

fun main(args: Array<String>) {
//    label()

    println(foo())
}

fun label() {
    LoopSeb1@ for (i in 1..100) {
        LoopAno@ for (x in 2..10) {
            println("i = $i , x = $x")
            if (x == 4) break@LoopAno
        }
        LoopN@ for (j in 1..10) {
            println("i = $i , j = $j")
            if (j == 2) continue@LoopSeb1
        }
    }
}

fun foo():String{
    run forEah@{
         listOf(1, 2, 3, 4, 5, 6, 7).forEach {
            if (it == 5) return@forEah "G"
            println(it)
        }
    }
    return "End"
}
