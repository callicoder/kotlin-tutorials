package t9_functions

// Local/Nested Function
fun findBodyMassIndex(weightInKg: Double, heightInCm: Double): Double {
    if(weightInKg <= 0) {
        throw IllegalArgumentException("Weight must be greater than zero")
    }
    if(heightInCm <= 0) {
        throw IllegalArgumentException("Height must be greater than zero")
    }

    // Nested function has access to the local variables of the outer function
    fun calculateBMI(): Double {
        val heightInMeter = heightInCm / 100
        return weightInKg / (heightInMeter * heightInMeter)
    }

    return calculateBMI()
}

fun main(args: Array<String>) {
    println(findBodyMassIndex(68.5, 170.0))
}