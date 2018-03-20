package MySourceCode


fun main(args: Array<String>) {
    whennn()
}

fun iff() {
    val a = 10
    var max = a + 2

    if (a < max) max = a

    var new: Int
    if (max < a) {
        max = a + 2
    } else {
        max = a
    }

    var newMax = if (a < max) a else a + 2

}

fun whennn(){
    var x = 2
    when(x){
        0 , 1 , 2 -> print("x ==0 or x == 1")
        else -> print("else")
    }
    println()
    when(x){
        in 1..4 -> print("1..4")
        is Int -> print("x is Int")
        !in 10..20 -> print("x is outside 10..20")
        else -> print("xas")
    }

}
