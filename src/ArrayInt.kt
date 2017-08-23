fun main(args: Array<String>) {
    var arrayInt = Array<Int>(5){0}
    arrayInt[3]=16
    println("Array[3] = "+arrayInt[3])
    println("Array[3] = "+arrayInt[2])
    println("Array[3] = "+arrayInt[1])

    println("Array element")
    for (element in arrayInt){
        println(element)
    }
    println("Array element by index")
    for (indesx in 0..4){
        println(arrayInt)
    }

}