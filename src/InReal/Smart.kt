package InReal

/***
*
* Nullability
*
***/

class Smart{
    var prop:String? = "abc"

    lateinit var x:String

    fun run(){
        val local:String? = "def"

        if (local != null)
            println(local.substring(1,2))
        /*
        or
        */
        println(local?.substring(1,2))

        println(prop!!.substring(1,2))
        // can not  println(prop.substring(1,2))

        prop?.let {
            println(it.substring(1,2))
        }
    }
}

fun main(args: Array<String>) {
    Smart().run()
}