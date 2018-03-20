package MySourceCode

fun main(args: Array<String>) {
    for (item in 1..5)
        println("item : $item")
/*
    item : 1
    item : 2
    item : 3
    item : 4
    item : 5*/

    var count=1
    while (count<=5){
        println("count : $count")
        count++
    }

    do {
        println("count : $count")
        count++
    }while (count<=5)

    var ran = 1..9
    for (item:Int in ran){

    }

}