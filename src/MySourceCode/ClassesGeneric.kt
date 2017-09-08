package MySourceCode

class UserAdmin<T>(credit:T){
    init {
        println(credit)
    }
}

fun main(args: Array<String>) {
    var userAdmin = UserAdmin<String>("sirirak")
    var userAdmin1 = UserAdmin<Int>(1234)
    var userAdmin2 = UserAdmin<Float>(11.5F)

}