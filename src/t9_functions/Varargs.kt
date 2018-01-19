package t9_functions

// Vararg function
fun sumOfNumbers(vararg numbers: Double): Double {
    var sum: Double = 0.0
    for(number in numbers) {
        sum += number
    }
    return sum
}

// Vararg function with another parameter
fun sumOfNumbers(vararg numbers: Double, initialSum: Double): Double {
    var sum = initialSum
    for(number in numbers) {
        sum += number
    }
    return sum
}

fun main(args: Array<String>) {
    // Calling vararg function

    sumOfNumbers(1.5, 2.0)  // Result = 3.5

    sumOfNumbers(1.5, 2.0, 3.5, 4.0, 5.8, 6.2)  // Result = 23.0

    sumOfNumbers(1.5, 2.0, 3.5, 4.0, 5.8, 6.2, 8.1, 12.4, 16.5)  // Result = 60.0


    // If there are other parameters following the vararg parameter,
    // then the values for those parameters can be passed using the named argument syntax -
    sumOfNumbers(1.5, 2.5, initialSum=100.0)


    // Pass an array to the vararg function using spread operator
    val a = doubleArrayOf(1.5, 2.6, 5.4)
    sumOfNumbers(*a)  // Result = 9.5
}