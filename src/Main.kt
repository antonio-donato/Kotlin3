
fun main(args: Array<String>) {
    val dell = Pc()
    dell.changePower()
    val variabile: String = ScriviCiao("Ciao")
    println(variabile)
    println("${dell.power}")
}

fun ScriviCiao(scritta: String) : String{
    println("Hai scritto $scritta")
    return "pippo"
}
