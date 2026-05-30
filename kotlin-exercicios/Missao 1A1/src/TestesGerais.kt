data class Creature(val nome: String, val tipo: String, val nivel: Int)

fun main() {
    val criatura1 = Creature("Bulbasaur", "Grama", 5)
    val criatura2 = Creature("Bulbasaur", "Grama", 5)
    val criatura3 = Creature("Bulbasaur", "Fogo", 15)

    println(criatura1 == criatura2)
    println(criatura1 == criatura3)
}