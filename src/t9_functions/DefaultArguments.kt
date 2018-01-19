package t9_functions

// Function with Default Argument
fun displayGreeting(message: String, name: String = "Guest") {
    println("Hello $name, $message")
}

// Function with a default parameter preceding a non-default parameter
fun arithmeticSeriesSum(a: Int = 1, n: Int, d: Int = 1): Int {
    return n/2 * (2*a + (n-1)*d)
}

fun main(args: Array<String>) {
    displayGreeting("Welcome to the CalliCoder Blog", "John")
    displayGreeting("Welcome to the CalliCoder Blog")

    arithmeticSeriesSum(1, 10)
}