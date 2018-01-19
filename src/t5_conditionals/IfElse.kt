package t5_conditionals

fun main(args: Array<String>) {
    // If Statement
    var n = 34
    if(n % 2 == 0) {
        println("$n is even")
    }

    // The curly braces are optional if the body of if statement contains a single line
    if(n % 2 == 0) println("$n is even")


    // =======================


    // If-Else Statement

    var a = 32
    var b = 55

    if(a > b) {
        println("max($a, $b) = $a")
    } else {
        println("max($a, $b) = $b")
    }

    // =======================

    // Using If as an expression
    var max = if(a > b) a else b
    println("max($a, $b) = $max")


    // If-Else branches with block bodies
    max = if(a > b) {
        println("$a is greater than $b")
        a
    } else {
        println("$a is less than or equal to $b")
        b
    }
    println("max($a, $b) = $max")


    // ========================

    // If Else If Chain
    var age = 17
    if(age < 12) {
        println("Child")
    } else if (age in 12..17) {
        println("Teen")
    } else if (age in 18..21) {
        println("Young Adult")
    } else if (age in 22..30) {
        println("Adult")
    } else if (age in 30..50) {
        println("Middle Aged")
    } else {
        println("Old")
    }

}