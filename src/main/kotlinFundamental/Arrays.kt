package KotlinFundamentals

fun main() {
    val array = arrayOf(1,3,5,7)
    val mixArray = arrayOf(1, 3, 5, 7 , "Dicoding" , true)

    val intArray = intArrayOf(1,3,5,7)
    println(intArray[2])

    intArray[2]= 11
    println(intArray[2])

    /*
    Kotlin juga memungkinkan kita untuk membuat Array dengan tipe data primitif dengan
    memanfaatkan beberapa fungsi spesifik berikut:

    intArrayOf() : IntArray
    booleanArrayOf() : BooleanArray
    charArrayOf() : CharArray
    longArrayOf() : LongArray
    shortArrayOf() : ShortArray
    byteArrayOf() : ByteArray
     */
}