class Criatura(val nome: String, val tipo: String, val nivel: Int)

fun main() {
    val pikachu = Criatura("Pikachu", "Elétrico", 25)
    val bulbasaur = Criatura("Bulbasaur", "Grama", 15)
    val charmander = Criatura("Charmander", "Fogo", 18)

    /*println("Nome: ${pikachu.nome}")
    println("Tipo: ${pikachu.tipo}")
    println("Nível: ${pikachu.nivel}")

    println("Nome: ${bulbasaur.nome}, Tipo: ${bulbasaur.tipo}, Nível: ${bulbasaur.nivel}")
*/

    val time = listOf(pikachu, bulbasaur, charmander)

    /*println("O time tem ${time.size} criaturas: ")
    for (criatura in time) {
        println("- ${criatura.nome} (${criatura.tipo}) - Nível ${criatura.nivel}")
    } */

    for (criatura in time) {
        if (criatura.nivel >= 20) {
            println("${criatura.nome} está em nível avançado.")
        }
    }
}
