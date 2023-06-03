package KotlinFundamentals

fun main() {

    //val text: String = null -> compile time error

    val text: String? = null // ready to go

    //val textLength = text.length // compile time error
     /*
     Lalu bagaimana cara kita mengakses atau mengelola nilai dari objek yang ditandai sebagai nullable?
     Cara mudahnya, periksa objek tersebut apakah bernilai null atau tidak:
      */

    if (text != null) {
        val textLength = text.length // ready to go
    }
    /*
    Dengan cara tradisional menggunakan if/else seperti di atas, kompiler akan
    mengizinkan kita untuk mengelola nilai dari sebuah variabel yang kita tandai sebagai nullable.
     */
}