fun main(args: Array<String>) {
    print("please enter your name:")
    var name= readLine()
    print("enter age")
    var age:Int = readLine()!!.toInt()
    // !!  not-null assert
    print("enter department:")
    val dep = readLine().toString();
    println("name "+name)
    println("age "+age)
    println("department "+dep)
}