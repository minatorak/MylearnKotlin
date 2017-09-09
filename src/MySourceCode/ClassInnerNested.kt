package MySourceCode

class Out{
    private val name:String?=null
    inner class Nested{
        // add inner class
        fun ShowT(){
            println("I am nested")
        }
    }
}

fun main(args: Array<String>) {
    val outer = Out()
    val nest = outer.Nested()
    nest.ShowT()
}