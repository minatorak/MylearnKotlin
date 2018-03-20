package MySourceCode

fun main(args: Array<String>) {
    var x = 10
    while (x>0){
        x--
    }
    println(x)

    do {
        val y = retrieveData()
    }while (y != null)


}

fun retrieveData(): Any? {
    return null
}
