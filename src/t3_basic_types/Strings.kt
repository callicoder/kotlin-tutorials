package t3_basic_types

fun main(args: Array<String>) {
    // Delcaring a String
    var myStr = "Hello World"


    // String Indexing
    var name = "John"
    var firstCharInName = name[0]  // 'J'
    var lastCharInName = name[name.length - 1]  // 'n'


    // Escaped and Raw String
    var myEscapedString = "Hello Reader,\nWelcome to my Blog"

    var myMultilineRawString = """
    The Quick Brown Fox
    Jumped Over a Lazy Dog.
    """

    println("$name, $firstCharInName, $lastCharInName, $myEscapedString, $myMultilineRawString")
}