package MySourceCode

class MyCar(Type:String,Model:Int,Price:Double,
            MilesDrive:Int,Owner:String){


    init {
        println("type :$Type\nModel :$Model" +
                "\nPrice :$Price\nMilesDrive :" +
                "$MilesDrive\nOwner :$Owner")
    }

}

fun main(args: Array<String>) {
    var Car1 = MyCar("BMW",2000,100.75,123,"sirirak")
    var Car2 = MyCar("toyota",1505,120.32,100,"Father")
}