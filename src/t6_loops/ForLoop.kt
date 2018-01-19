package t6_loops

fun main(args: Array<String>) {

    // For loop - iterating through a range
    for(value in 1..10) {
        print("$value ")
    }

    // Iterating through an array
    var primeNumbers = intArrayOf(2, 3, 5, 7, 11)

    for(number in primeNumbers) {
        print("$number ")
    }

    // Iterating through an array using indices

    primeNumbers = intArrayOf(2, 3, 5, 7, 11)

    for(index in primeNumbers.indices) {
        println("PrimeNumber(${index+1}): ${primeNumbers[index]}")
    }


    // Retrieve array index and element in each iteration using withIndex()

    primeNumbers = intArrayOf(2, 3, 5, 7, 11)

    for((index, number) in primeNumbers.withIndex()) {
        println("PrimeNumber(${index+1}): $number")
    }
}