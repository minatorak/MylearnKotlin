package MySourceCode.ClassObj

open class Vase(val name: String) {
    init {
        println("init class")
    }

    open val size: Int = name.length.also { println("Init size of name $it") }
}

class Derived(name: String, lastName: String)
    : Vase(name.capitalize().also { println("Args of $it") }) {
    init {
        println("Init class Derived")
    }

    override val size: Int =
            (super.size + lastName.length).also { println("Initializing size in Derived: $it") }
}

fun main(args: Array<String>) {
    var obj = Derived("minato","rak")
}