package MySourceCode

import sun.util.calendar.BaseCalendar
import java.util.*

//@file:JvmName("ArraySwap")
fun ArrayList<String>.swap1(index1:Int,index2: Int){
    val temp = this.get(index1)
    this[index1] = this.get(index2)
    this[index2] = temp
}
fun main(args: Array<String>) {
    val arr = ArrayList<String>()
    arr.add("god")
    arr.add("evil")
    arr.add("love")
    println(arr)
    arr.swap1(1,2)
    println(arr)
}