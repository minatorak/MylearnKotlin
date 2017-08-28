package MySourceCode
fun show(name:String):Unit{
    println("name :"+ name)
}
fun show(number:Int):Unit{
    println("numberInt :"+number)
}
fun show(number:Double):Unit{
    println("numberDouble :"+number)
}

fun main(args: Array<String>) {
    show(" is String")
    show(10.5)
    show(100)
}

