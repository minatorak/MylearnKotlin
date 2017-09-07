package MySourceCode

abstract class CreditCard(){
    fun CreditID():String{
        return "2354asf41"
    }
    abstract fun newCredit()

}
class UserInfomation():CreditCard(){
    override fun newCredit() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun getInfo():String{
        return CreditID()
    }

}

fun main(args: Array<String>) {
    var user = UserInfomation()
    println(user.getInfo())
}