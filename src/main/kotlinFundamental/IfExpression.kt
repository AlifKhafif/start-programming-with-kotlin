fun main() {
    val openHours = 7
    val now = 20
    val office: String
    if (now > openHours) {
        office = "Office already open"
    } else {
        office = "Office is closed"
    }
    println(office) //
// atau bisa dengan algoritma ini sebagai gabungan dari else dan if

    val openHours2 = 7
    val now2 = 7
    val office2: String

    office2 = if (now2 > 7) {
        "Office already open"
    } else if (now2 == openHours2){
        "Wait a minute, office will be open"
    }else{
        "Office is closed"
    }

    println(office2)
}
