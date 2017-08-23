fun main(args: Array<String>) {

    for (count in 1..10){
        if (count!=4){
            println("count: $count")
        }
    }
    // as same
    (1..10)
            .filter { it !=4 }
            .forEach { println("count: $it") }
    /**
     *
     *
     *
     */
    for (count in 1..10){
        if (count!=4){
            println("count: $count")
        }else if (count==4){
            println("else count: $count")
        }
    }
    /**
     *
     *
     */
    for (count in 1..10){
        if (count==4){
            continue
        }
        println("loop2.1 :$count")
    }
    (1..10)
            .filter { it != 4 }
            .forEach { println("loop2.2 :$it") }
    /**
     *
     *
     */
    for (count in 1..10){
        if (count==2){
            break
        }
        println("loop3.1 :$count")
    }
    (1..10)
            .takeWhile { it != 2 }
            .forEach { println("loop3.2 :$it") }
    /**
     *
     *
     */
    loop@ for (count in 1..10){
        for (count2 in 1..5){
         println("loop4 :$count2")
            if (count2==2)
                break@loop
        }
    }
}