fun main(args: Array<String>) {
    var n1=10
    var n2=20
    var max=if (n1>n2) n1 else n2
    var maxx:Int
    if (n1>n2){
        maxx=n1
    }else{
        maxx=n2
    }

    println("max: $max")
    println("maxx: $maxx")
    //
    var age=30

    var isYoung=when(age){
        in 10..30->true
        else->false
    }
    println("isYoung:$isYoung")
}