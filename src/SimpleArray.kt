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
    for (index in 0..4){
        println(arrayInt[index])
    }

    var arraystr=Array<String>(4){""}
    for (index in 0..3){
        println("enter Text is($index):")
        arraystr[index]= readLine()!!
    }
    for (i in 0..3){
        println("array [$i] = "+arraystr[i])
    }

    /**
     *
     * Array List
     *
     */
    // Create and Add
    var arraylist= ArrayList<String>()
    arraylist.add("Flower")
    arraylist.add("Cat")
    arraylist.add("Dog")
    arraylist.add("Rat")
    arraylist.add("Water")
    // Print and Edit
    println("[3] is "+arraylist[3])
    println("[3] is "+arraylist.get(0))
    arraylist.set(0,"Bug")

    println("all element")
    for (item in arraylist)
        println(item)
    for (index in 0..arraylist.size-1)
        println(arraylist.get(index))
    //Search
    println(arraylist.contains("Flower"))
}