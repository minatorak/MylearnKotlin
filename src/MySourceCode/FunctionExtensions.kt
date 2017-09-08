package MySourceCode

fun ArrayList<String>.mswap(index1:Int,index2: Int){
    var temp = this.get(index1)
    this.set(index1,this.get(index2))
    this.set(index2,temp)
}
fun main(args: Array<String>) {
    var arr = ArrayList<String>()
    arr.add("god")
    arr.add("evil")
    arr.add("love")
    println(arr)
    arr.mswap(1,2)
    println(arr)
}