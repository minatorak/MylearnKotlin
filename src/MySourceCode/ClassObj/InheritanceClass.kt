package MySourceCode.ClassObj


// Keyword open like final
open class Base(p:Int)

class DG(p: Int):Base(p)


// -------------
class MyView : View {
    constructor(st: String) : super(st)
    constructor(st: String, num: Int) : super(st, num)
}

open class View(st: String = "", num: Int = 0)
