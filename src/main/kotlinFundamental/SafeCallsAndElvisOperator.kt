package KotlinFundamentals

fun main() {
    //Safe calls operator

    val text: String? = null
    text?.length

    /*
    Dalam menggunakan safe call,
    kita akan mengganti tanda titik (.) dengan tanda (?.)
    saat mengakses atau mengelola nilai dari objek nullable.
     */

    //Elvis Operator
    //Elvis operator memungkinkan kita untuk menetapkan default value atau nilai dasar jika objek bernilai null

    val textLength = text?.length ?: 7
        /*
        Kode di atas sebenarnya sama
        seperti ketika kita menggunakan if/else berikut:
        */

    val textLength2 = if (text != null) text.length else 7
        /*
        Elvis akan mengembalikan nilai text.length jika text tidak bernilai null.
        Sebaliknya, jika text bernilai null maka default value yang akan dikembalikan.
         */

}