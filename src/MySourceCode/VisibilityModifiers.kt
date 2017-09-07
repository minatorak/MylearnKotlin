package MySourceCode

open class MData(){
    public var ProcessName:String?=null
    protected var protectedName:String="protected"
    //private
}

class MControl():MData(){
    fun GetName(chose:Int){
        if (chose == 1)
        super.ProcessName
        else if (chose == 2)
            super.protectedName
    }

}

fun main(args: Array<String>) {

    var con = MControl()
    println("con.PublicName"+con.GetName(1))
    println("con.protectedName"+con.GetName(2))

}