fun main(args: Array<String>) {
    val variabile: String = ScriviCiao("Ciao")
    println(variabile)
}

fun ScriviCiao(scritta: String) : String{
    println("Hai scritto $scritta")
    return "pippo"
}
