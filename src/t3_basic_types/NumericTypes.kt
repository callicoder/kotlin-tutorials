package t3_basic_types

fun main(args: Array<String>) {
    // Kotlin Numeric Types Examples
    val myByte: Byte = 10
    val myShort: Short = 125

    val myInt = 1000
    val myLong = 1000L	// The suffix 'L' is used to specify a long value

    val myFloat = 126.78f   // The suffix 'f' or 'F' represents a Float
    val myDouble = 325.49

    // Use underscores to make numeric values more readable
    val hundredThousand = 100_000
    val oneMillion = 1_000_000

    val myHexa = 0x0A0F  // Hexadecimal values are prefixed with '0x' or '0X'
    val myBinary = 0b1010  // Binary values are prefixed with '0b' or '0B'

    println("$myByte $myShort $myInt $myLong $myFloat $myDouble $hundredThousand $oneMillion $myHexa $myBinary")
}
