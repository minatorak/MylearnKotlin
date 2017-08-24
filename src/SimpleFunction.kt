
fun summ(n1:Double,n2:Double):Double{
    var sum = n1+n2
    return sum
}

fun display(m:Int):Unit{
    println("n: $m")
}
fun main(args: Array<String>) {
    var summery =summ(12.3,15.0)
    println("12.3+15.0 = $summery")

    display(10)
    display()
}