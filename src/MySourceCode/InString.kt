package MySourceCode

fun main(args: Array<String>) {

    var title=" welcome to new york"
    var Text="title:$title"


    println(Text)
    println(Text[3])
    println(Text.toUpperCase())
    println(Text.toLowerCase())
    println(Text.length)
    println(Text.split(" "))
    println(Text.trim())

    val text = """
    for (c in "foo")
    print(c)
    """
    println(text)

//    trimMargin
    println()
    val text2 = """
|Tell me and I forget.|Teach me and I remember.
|Involve me and I learn.
|(Benjamin Franklin)
""".trimMargin()
    println(text2)

    val s = "abc"+1
    println(s) //abc1
}