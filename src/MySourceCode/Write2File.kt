package MySourceCode

import java.io.FileReader
import java.io.FileWriter

fun main(args: Array<String>) {
//    WrtieFile("sirirak")
    println("enter 1-read\nenter 2-write\n")
    var select = readLine()!!.toInt()
    when(select){
        1->{
            ReadFile()
        }
        2->{
            println("Write ")
            val str:String= readLine().toString()
            WrtieFile(str)
        }

    }

}

fun WrtieFile(str: String) {
    try {
        val fo = FileWriter("text.txt", true)
        fo.write(str)
        fo.close()
    } catch (e: Exception) {
        println(e.message)
    }
}
fun ReadFile(){
    try {
        var fin=FileReader("text.txt")
        var c:Int?
        do {
            c=fin.read()
            print(c.toChar())
        }while (c!=-1)
    }catch (e:Exception){
        println(e.message)
    }

}