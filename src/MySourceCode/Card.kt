package MySourceCode

val suit = listOf("C", "D", "H", "S")
//13 26 39 52
val num = listOf("2", "3", "4", "5", "6", "7", "8", "9", "0", "J", "Q", "K", "A")
fun main(args: Array<String>) {

CardAt(0)
CardAt(1)
CardAt(34)
CardAt(35)
}

fun CardAt(index: Int) {
    if (index > -1 && index < 53){
        val idx_Suit = suit[index / num.size]
        val answer = num[index%13] + idx_Suit
        println("cardAt($index) = $answer")
    }else{
        println("out of length")
    }
}