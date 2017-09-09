package MySourceCode

class ClassSingleton() {
    var name:String?=null

    init {
        println("create class")
    }
    companion object {
        val instance:ClassSingleton by lazy { ClassSingleton() }
    }
}

fun main(args: Array<String>) {
    val single = ClassSingleton()
    single.name="sirirak"
    println(single.name)

    val Notsingle = ClassSingleton()
    println(Notsingle.name)

    val newsingle = ClassSingleton.instance
    newsingle.name = "sirirak"
    println("newsingle :"+newsingle.name)

    val callsingle = ClassSingleton.instance
    println(callsingle.name)
}