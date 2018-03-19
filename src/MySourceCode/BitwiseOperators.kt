package MySourceCode

fun main(args: Array<String>) {
    val leftShift = 1 shl 2
    val rightshift = 1 shr 2
    val unsignedRightShift = 1 ushr 2

    var binary = 0b00001111
    println(binary)
    binary = binary shr  2
    println(binary)
    val x = (1 shl 2) and 0x000FF000


}

//shl(bits) – signed shift left (Java's << )
//shr(bits) – signed shift right (Java's >> )
//ushr(bits) – unsigned shift right (Java's >>> )
//and(bits) – bitwise and
//or(bits) – bitwise or
//xor(bits) – bitwise xor
//inv() – bitwise inversion