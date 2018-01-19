package t9_functions

fun main(args: Array<String>) {
    // Function call with Named Arguments
    arithmeticSeriesSum(n=10)
    arithmeticSeriesSum(a=3, n=10, d=2)

    // You can also reorder the arguments if you’re specifying the names
    arithmeticSeriesSum(n=10, d=2, a=3)

    // You can use a mix of named arguments and position-based arguments
    // as long as all the position-based arguments are placed before the named arguments
    arithmeticSeriesSum(3, n=10)
}