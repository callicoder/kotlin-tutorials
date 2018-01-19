package t5_conditionals

fun main(args: Array<String>) {
    // When Statement
    var dayOfWeek = 4
    when(dayOfWeek) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid Day")
    }

    // ===============================

    // When with Block body
    dayOfWeek = 1
    when(dayOfWeek) {
        1 -> {
            // Block
            println("Monday")
            println("First day of the week")
        }
        7 -> println("Sunday")
        else -> println("Other days")
    }

    // ===============================

    dayOfWeek = 4

    var dayOfWeekInString = when(dayOfWeek) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid Day"
    }

    println("Today is $dayOfWeekInString")	// Today is Thursday


    // ===================================


    // Combining multiple when branches into one using comma
    dayOfWeek = 6
    when(dayOfWeek) {
        1, 2, 3, 4, 5 -> println("Weekday")
        6, 7 -> println("Weekend")
        else -> println("Invalid Day")
    }


    // ===================================


    // Checking whether a given value is in a range or not using in operator
    var dayOfMonth = 5
    when(dayOfMonth) {
        in 1..7 -> println("We're in the first Week of the Month")
        !in 15..21 -> println("We're not in the third week of the Month")
        else -> println("none of the above")
    }


    // ===================================


    // Checking whether a given variable is of certain type or not using is operator
    var x : Any = 6.86
    when(x) {
        is Int -> println("$x is an Int")
        is String -> println("$x is a String")
        !is Double -> println("$x is not Double")
        else -> println("none of the above")
    }


    // ===================================


    // Using when as a replacement for an if-else-if chain

    var number = 20
    when {
        number < 0 -> println("$number is less than zero")
        number % 2 == 0 -> println("$number is even")
        number > 100 -> println("$number is greater than 100")
        else -> println("None of the above")
    }
}