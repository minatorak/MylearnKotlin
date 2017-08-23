fun main(args: Array<String>) {
    val x = 11
    when (x) {
        1 -> {
            print("value is 1")
        }
        2 -> {
            print("value is 2")
        }
        3 -> {
            print("value is 3")
        }
        4,5 -> {
            print("value is 4,5")
        }
        in 5..10->{
            print("value is 10..10")
        }
        !in 5..10->{
            print("value isn't 5..10 ")
        }
        else -> {
            print("value is out of range")
        }
    }
}