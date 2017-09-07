package MySourceCode

enum class Direction{
    NORTH,SOUTH,EAST,WEST
}

fun main(args: Array<String>) {
    var userdirect=Direction.SOUTH

    if (userdirect == Direction.SOUTH){
        println("go to north ")
    }else{
        println("")
    }
}