package t9_functions

// Function
fun avg(a: Double, b: Double): Double {
    return  (a + b)/2
}

// Single Expression Function
fun avgSingleExpression(a: Double, b: Double) = (a + b)/2


// Unit returning Function
fun printAverage(a: Double, b: Double): Unit {
    println("Avg of ($a, $b) = ${(a + b)/2}")
}

fun main(args: Array<String>) {
    println(avg(4.6, 9.0))
    println(avgSingleExpression(4.6, 9.0))
    printAverage(4.6, 9.0);
}