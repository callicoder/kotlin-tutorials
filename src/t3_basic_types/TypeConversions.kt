package t3_basic_types

fun main(args: Array<String>) {
    val myInt = 100
    val myLong = myInt.toLong()   // Explicitly converting 'Int' to 'Long'

    val doubleValue = 176.80
    val intValue = doubleValue.toInt()  // 176

    val anotherInt = 1000
    anotherInt.toString()  // "1000"

    val str = "1000"
    val intValueofStr = str.toInt()
}