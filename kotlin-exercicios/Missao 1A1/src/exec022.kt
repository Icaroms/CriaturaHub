class Criaturas(val nome: String, val tipo: String, val nivel: Int)

fun main() {
    val snorlax = Criaturas("Snorlax", "Normal", 55)
    val charizard = Criaturas("Charizard", "Fogo", 42)
    val mewtwo = Criaturas("Mewtwo", "Psíquico", 62)
    val cyndaquil = Criaturas("Cyndaquil", "Fogo", 8)
    val lapras = Criaturas("Lapras", "Água", 33)

    val capturadas = listOf(snorlax, charizard, mewtwo, cyndaquil, lapras)

    for (c in capturadas) {
        if (c.nivel >= 30) {
            println("${c.nome} (${c.tipo}) está pronta para batalha.")
        }
    }
}