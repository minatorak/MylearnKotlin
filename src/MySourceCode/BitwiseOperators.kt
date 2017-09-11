package MySourceCode

fun main(args: Array<String>) {
    val leftShift = 1 shl 2
    val rightshift = 1 shr 2
    val unsignedRightShift = 1 ushr 2

    var binary = 0b00001111
    println(binary)
    binary = binary shr  2
    println(binary)

}