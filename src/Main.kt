fun main(args: Array<String>) {
    var variabile:String = ""
    ScriviCiao("Ciao", variabile)
    println("$variabile")
}

var varibile: String = ""

fun ScriviCiao(scritta: String, variabile: String) {
    println("Hai scritto $scritta")
    variabile="pippo"
}
