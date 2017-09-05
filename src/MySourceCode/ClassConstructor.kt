package MySourceCode

class Car1(Type:String,Model:Int,Price:Double,
           MilesDrive:Int,Owner:String){
    var Owner:String?=null
    var MilesDrive:Int?=null
    var Price:Double?=null

    init {
        println("Type :$Type")
        println("Model :$Model")
        println("Price :$Price")
        println("MilesDrive :$MilesDrive")
        println("Owner :$Owner")
        this.MilesDrive=MilesDrive
        this.Owner = Owner
        this.Price = Price
    }

    fun GetOwner():String?{
        return this.Owner
    }

}

fun main(args: Array<String>) {
    var MyCar = Car1("BMW",2015,1000.0,105,"Sirirak")
    println("GetOwner : "+MyCar.GetOwner())
    println("non method price : "+MyCar.Price)
}