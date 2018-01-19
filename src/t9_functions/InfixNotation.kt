package t9_functions

data class ComplexNumber(val realPart: Double, val imaginaryPart: Double) {
    // Infix function for adding two complex numbers
    infix fun add(c: ComplexNumber): ComplexNumber {
        return ComplexNumber(realPart + c.realPart, imaginaryPart + c.imaginaryPart)
    }
}

fun main(args: Array<String>) {
    // Infix function example

    val c1 = ComplexNumber(3.0, 5.0)
    val c2 = ComplexNumber(4.0, 7.0)

    // Usual call
    c1.add(c2) // produces - ComplexNumber(realPart=7.0, imaginaryPart=12.0)

    // Infix call
    c1 add c2  // produces - ComplexNumber(realPart=7.0, imaginaryPart=12.0)
}