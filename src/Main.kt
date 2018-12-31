
fun main(args: Array<String>) {
    val dell = Pc()
    val variabile = ScriviCiao("Ciao")
    println(variabile)

    dell.changePower()
    println("${dell.power}")

    dell.calculate()
    println("${dell.velocita}")
}

fun ScriviCiao(scritta: String) : String{
    println("Hai scritto $scritta")
    return "pippo"
}
