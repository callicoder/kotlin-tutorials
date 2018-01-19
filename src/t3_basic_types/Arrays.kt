package t3_basic_types

fun main(args: Array<String>) {

    // Creating Arrays
    var numbers = arrayOf(1, 2, 3, 4, 5)
    var animals = arrayOf("Cat", "Dog", "Lion", "Tiger")

    var mixedArray = arrayOf(1, true, 3, "Hello", 'A')	// Works and creates an array of Objects

    var numArray = arrayOf<Int>(1, 2, 3, 4)  // Enforcing Type



    // Array Indexing
    val myDoubleArray = arrayOf(4.0, 6.9, 1.7, 12.3, 5.4)
    val firstElement = myDoubleArray[0]
    val lastElement = myDoubleArray[myDoubleArray.size - 1]



    // Primitive Arrays
    val myCharArray = charArrayOf('K', 'O', 'T')  // CharArray (corresponds to Java 'char[]')
    val myIntArray = intArrayOf(1, 3, 5, 7)		// IntArray (corresponds to Java 'int[]')



    // Creating Arrays using Array() constructor
    var mySquareArray = Array(5, {i -> i * i})	// [0, 1, 4, 9, 16]
}