package t4_operators

fun main(args: Array<String>) {
    // String Concatenation
    var firstName = "Rajeev"
    var lastName = "Singh"
    var fullName = firstName + " " + lastName	// "Rajeev Singh"

    // String Interpolation
    var a = 12
    var b = 18
    println("Avg of $a and $b is equal to ${ (a + b)/2 }")
}