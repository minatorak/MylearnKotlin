package MySourceCode

var myName = "global"
/*
  global
*/

fun display(name:String){
    println("name :$name")
}


fun main(args: Array<String>) {
    display(myName)

    var myName="local "

    display(myName)

}