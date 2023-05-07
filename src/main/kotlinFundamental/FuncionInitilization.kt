fun main() {

    val user = setUser("Alif", 24)
    println (user)

    printUser ("Alif")
}

fun setUser (name: String, age: Int) = "My name is $name, and my $age years old"

fun printUser (name: String){
    println("My name is $name")
}
