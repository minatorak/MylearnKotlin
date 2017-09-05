package MySourceCode

class MyCar(Type:String,Model:Int,Price:Double,
            MilesDrive:Int,Owner:String){
    var Owner:String?=null
    var Price:Double?=null
    var MilesDrive:Int?=null

    init {
        println("type :$Type\nModel :$Model" +
                "\nPrice :$Price\nMilesDrive :" +
                "$MilesDrive\nOwner :$Owner")
        this.Owner = Owner
        this.Price = Price
        this.MilesDrive = MilesDrive
    }
    fun getPrice():Double{
        return this.Price!!-(this.MilesDrive!!.toDouble())
    }

    fun getOwners():String?{
        return this.Owner;
    }

}

fun main(args: Array<String>) {
    var Car1 = MyCar("BMW",2000,100.75,123,"sirirak")
    println("GetPrice :"+Car1.getPrice())
    println("Price :"+Car1.Price)
    println("getOwners :"+Car1.getOwners())
    println("Owner :"+Car1.Owner)
    var Car2 = MyCar("toyota",1505,120.32,100,"Father")


}