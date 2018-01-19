package t2_variables

fun main(args: Array<String>) {

    /*
        Declaring Variables
     */

    // Immutable variable (val)
    val name = "Bill Gates"
    // name = "Satoshi Nakamoto"	Error: Val cannot be reassigned

    // Mutable variable (var)
    var country = "USA"
    country = "India"    // Works

    println("$name, $country")



    //===========================

    /*
      Type inference
    */

    val greeting = "Hello, World"  // type inferred as `String`
    val year = 2018                // type inferred as `Int`


    // Explicitly defining the type of variables
    val myStr: String = "Hello"
    val myInt: Int = 20


    // Type declaration is mandatory here, since the variable is not initialized at the time of declaration
    var language: String
    language =  "French"

    println("$greeting $year $myStr $myInt $language")
}