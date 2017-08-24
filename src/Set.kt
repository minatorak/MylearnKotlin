fun main(args: Array<String>) {
    var setEmenet= setOf(1,2,3,3,11,12,11)
 //   setEmenet.add(13)   //can not add or change
    for (item in setEmenet){
        println(item)
    }

    var setEmenet2 = mutableSetOf(1,2,3,4,4,5,6,5)
    setEmenet2.add(7)
    for (element in setEmenet2){
        println(element)
    }
    val setEmenet3 = mutableSetOf(1,2)
    setEmenet2 = setEmenet3
//    setEmenet3 = setEmenet2 // setEmenet3 not var
    setEmenet2 = setEmenet as MutableSet<Int>

}