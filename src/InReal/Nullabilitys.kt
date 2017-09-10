package InReal

class BooleanProvider(){
    val bool = true
}

fun main(args: Array<String>) {
    val provider:BooleanProvider?=null
    if (provider!=null&&provider.bool) println("true")
}