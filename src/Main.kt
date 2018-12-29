fun main(args: Array<String>) {
    val variabile: String
    variabile=ScriviCiao("Ciao")
    println(variabile)
}

var varibile: String = ""

fun ScriviCiao(scritta: String) : String{
    println("Hai scritto $scritta")
    return "pippo"
}
