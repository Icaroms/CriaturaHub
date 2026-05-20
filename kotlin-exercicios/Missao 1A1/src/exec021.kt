class  Item(val nome: String, val quantidade: Int)

fun main() {
    val pocao = Item("Poção", 5)
    val pokebola = Item("Pokébola", 10)
    val repelente = Item("Repelente", 2)

    val mochila = listOf(pocao, pokebola, repelente)

    for (item in mochila) {
        println("${item.quantidade}x ${item.nome}")
    }
}