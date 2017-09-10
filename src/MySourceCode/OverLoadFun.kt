package MySourceCode

fun sums(n1:Int,n2:Int):Int{
    return n1+n2
}

fun sums(n1:Int,n2: Int,n3:Int)= sums(n1, n2) +n3



fun main(args: Array<String>) {

    var sumNumber = sums(10, 11)
    println("sum 10 11 :$sumNumber")
    sumNumber = sums(12, 13, 14)
    println("sum (12 13 14) :$sumNumber")
}