package MySourceCode

/**
 * Operations
 * 1- ()
 * 2- ++,--(before var)
 * 3- ^
 * 4- *,/
 * 5- +,-
 * 6- =
 *
 */

fun main(args: Array<String>) {
    var x=10
    var y=11
    println(x/++y)

    var m=x++ +y
    println("m : $m")

    
}