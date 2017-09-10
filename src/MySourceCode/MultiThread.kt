package MySourceCode

fun main(args: Array<String>) {
    var t1= Usethread()
    t1.stackTrace
}

class Usethread() : Thread() {

    override fun run() {
        super.run()
        var count = 0
        while (count < 10) {
            println("Count $count")
            count++

            try {
                Thread.sleep(1000)

            } catch (e: Exception) {
            println(e.message)
            }

        }
    }
}