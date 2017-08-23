import java.util.*

fun main(args: Array<String>) {
    print("enter your year of birth ")
    var year:Int= readLine()!!.toInt()

    var now=Calendar.getInstance().get(Calendar.YEAR)
    var age= now-year

    println("Your age is $age year")

}