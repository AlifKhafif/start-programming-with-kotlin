fun main() {
    val textString = "Kotlin"
    println(textString)

    val text = "Kotlin"
    val firstChar = text[0]
    println("First character of $text is $firstChar")

    val statment = "Kotlin is \"Awesome!\"" //this is Escaped String
    println(statment)

    /*
        \t : adds tabs to the text.

        \n: Creates a new line in the text.

        \': adds a single quote character to the text.

        \": Adds a double quote character to the text.

        \\: adds a backslash character to text.
     */

        val name = "Unicode test: \u00A9" //String with Unicode
        println(name)

        val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent() //this is Raw String

        println(line)

}