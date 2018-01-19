package t7_nullsafety

fun main(args: Array<String>) {

    // All variables are non-null by default
    var greeting: String = "Hello, World"
    // greeting = null // Compilation Error


    // Declare nullable variables by appending a `?` in the type declaration
    var nullableGreeting: String? = "Hello, World"
    nullableGreeting = null // Works


    // Direct method calls and property access on non-null variables are allowed
    val len = greeting.length
    val upper = greeting.toUpperCase()

    /*
       Direct method calls and property access on nullable variables are no allowed
       because that might result into NullPointerException
     */

    // val nullableLen = nullableGreeting.length // Compilation Error
    // val nullableUpper = nullableGreeting.toUpperCase()  // Compilation Error


    // ===================================


    // Adding a null check
    var nullableName: String? = "John"

    if (nullableName != null) {
        println("Hello, ${nullableName.toUpperCase()}.")
        println("Your name is ${nullableName.length} characters long.")
    } else {
        println("Hello, Guest")
    }


    // ===================================


    // Using Safe call operator ?:
    println(nullableName?.toUpperCase())


    // ===================================

    // Using ?.let to perform an operation only if a variable is not null
    nullableName = null

    nullableName?.let { println(it.toUpperCase()) }
    nullableName?.let { println(it.length) }


    // ===================================


    // Using Elvis operator ?:
    var name = nullableName ?: "Guest"
    val nameLen = nullableName?.length ?: -1


    // ===================================

    nullableName = null
    println(nullableName!!.toUpperCase()) // Results in NullPointerException


    // ===================================

    // Collection of nullable types
    val listOfNullableTypes: List<Int?> = listOf(1, 2, null, 3)


    // ===================================


    // Nullable Collection
    var nullableList: List<Int>? = listOf(1, 2, 3)
    nullableList = null // Works


    // ===================================


    // Nullable Collection of Nullable Types
    var nullableListOfNullableTypes: List<Int?>? = listOf(1, 2, null, 3) // Works
    nullableListOfNullableTypes = null // Works
}