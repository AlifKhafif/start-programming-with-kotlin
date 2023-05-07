fun main() {
    //conjunction atau operator AND &&
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isOpen = if (now >= officeClosed && now <= officeClosed){
        true
    }else {
        false
    }
    println("Office is open : $isOpen")

    /*
    Fungsi di atas menguji apakah jam sekarang berada di antara jam waktu buka kantor dan jam tutup kantor.
    If expressions di atas bisa Anda sederhanakan jadi seperti berikut:
     */

    val isOpen2 = now  >= officeOpen && now <= officeClosed

    println("Office is open : $isOpen2")
    println("----------------------------")

    //disjunction atau operator OR ||

    val isClosed = now < officeOpen || now > officeClosed
    println("Office is closed : $isClosed")
    println("----------------------------")

    /*
    Variabel isClose di atas bernilai true.
    Alasannya, hasil evaluasi salah satu expression yang diberikan, bernilai true,
    yaitu expression disebelah kanan.
     */

    //Negation atau Operator NOT !

    val isOpen3 = now > officeOpen

    if (!isOpen3){
        println("Office is closed")
    } else {
        println("Office is open")
    }

    /*
    Hasil evaluasi expression di atas adalah true.
    Tapi ketika menggunakan operator NOT maka akan dinegasikan menjadi nilai false.
    Sehingga statement pada branch else-lah yang akan dijalankan.
     */
}