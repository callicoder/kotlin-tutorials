package t4_operators

fun main(args: Array<String>) {
    var a = 10
    var b = 20
    var c = ((a + b) * ( a + b))/2   // 450

    var isALessThanB = a < b   // true

    a++     // a now becomes 11
    b += 5  // b equals to 25 now


    // =======================


    // Operators are internally converted to method calls
    var x = 4
    var y = 5

    println(x + y)

    // equivalent to
    println(x.plus(y))


    // ======================


    // Bitwise Operators
    1 shl 2   // Equivalent to 1.shl(2), Result = 4
    16 shr 2  // Result = 4
    2 and 4   // Result = 0
    2 or 3    // Result = 3
    4 xor 5   // Result = 1
    4.inv()   // Result = -5


}
