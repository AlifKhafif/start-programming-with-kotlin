package KotlinFundamentals

//number initilization
/* Int (32 Bit) */
val intNumbers = 100

/* Long (64 Bit) */
val longNumber: Long = 100
val longNumbers = 100L

/* Short (16 Bit) */
val shortNumber: Short = 10

/* Byte (8 Bit) */
val byteNumber = 0b11010010

/* Double (64 Bit) */
val doubleNumbers = 1.3

//number with max & min values
fun main() {
    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE

    println(maxInt)
    println(minInt)

    println("----------------------------")

//Numbers operations
    val numberOne = 1
    val numberTwo = 2

    println(numberOne + numberTwo)

    println(numberOne / numberTwo)

    println(5 + 4 * 4)

    println((5 + 4) * 4)

    println("----------------------------")

//Numbers Conversion

    val stringNumber ="23"
    val intNumber = 3

    println(intNumber + stringNumber.toInt())

    /*
    toByte(): Byte
    toShort(): Short
    toInt(): Int
    toLong(): Long
    toFloat(): Float
    toDouble(): Double
    toChar(): Char
     */

}
