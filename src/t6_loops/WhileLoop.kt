package t6_loops

fun main(args: Array<String>) {
    // While Loop
    var x = 1
    while(x <= 5) {
        println("$x ")
        x++
    }

    // =======================

    // do-while Loop

    x = 1
    do {
        print("$x ")
        x++
    } while(x <= 5)

    // Since do-while loop tests the condition at the end of the loop. It is executed at least once
    x = 6
    do {
        print("$x ")
        x++
    } while(x <= 5)

}