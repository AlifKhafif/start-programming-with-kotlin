package KotlinFundamentals

fun main() {
    val name = "Alif"
    val old = 23
    println("My name is $name, im $old years old")

    //String Template with expression
    val hour = 7
    print("Office ${if (hour > 7) "already close" else "is open"}")

}