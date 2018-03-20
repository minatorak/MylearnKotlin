package MySourceCode.ClassObj

interface Foo{
    val count:Int
}

class Bar1(override val count: Int):Foo

class Bar2:Foo{
    override val count: Int
        get() = 0
}
