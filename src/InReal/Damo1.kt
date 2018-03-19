package InReal

import java.util.*

class JavaStreams{
    val rang: IntRange = 1..10
    val list = listOf(1,2,3,4,5,6,7,8,9,10).subList(1,9)
    val mutable = mutableListOf(1,2,3,4,1,2)

}

fun main(args: Array<String>) {

    val list = JavaStreams().list as Collection<Int>
    println(list)
    
    list.forEach {

    }

    val date = Date()
    date.hello()

}

private fun Date.hello() {
    println("hi")
}