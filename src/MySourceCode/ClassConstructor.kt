package MySourceCode

class Car1(Type:String,Model:Int,Price:Double,
           MilesDrive:Int,Owner:String){

    init {
        println("Type :$Type")
        println("Model :$Model")
        println("Price :$Price")
        println("MilesDrive :$MilesDrive")
        println("Owner :$Owner")

    }

  /*  var Owner:String?=null
    var Price:Double?=null
    var MilesDrive:Int?=null
    var Model:Int?=null
    var Type:String?=null

    constructor(Type:String,Model:Int,Price:Double,
                MilesDrive:Int,Owner:String) : this() {

    }
*/
}

fun main(args: Array<String>) {
    var MyCar = Car1("BMW",2015,1000.0,105,"Sirirak")


}