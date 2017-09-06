package MySourceCode

class CarCon(){
    var Model:Int?=null
    var Type:String?=null
    var Owner:String?=null
    var MilesDrive:Int?=null
    var Price:Double?=null

    constructor(Type:String,Model:Int,Price:Double,
                MilesDrive:Int,Owner:String) : this() {
        println("Type :$Type")
        println("Model :$Model")
        println("Price :$Price")
        println("MilesDrive :$MilesDrive")
        println("Owner :$Owner")
        this.MilesDrive=MilesDrive
        this.Owner = Owner
        this.Price = Price
        this.Model = Model
        this.Type = Type
    }
    constructor(Owner: String):this(){
        println("new class")
    }


    fun GetOwner():String?{
        return this.Owner
    }

}

fun main(args: Array<String>) {
    var MyCar = CarCon("BMW",2015,1000.0,105,"Sirirak")
    println("GetOwner : "+MyCar.GetOwner())
    println("non method price : "+MyCar.Price)
    var car = CarCon("jo")
}