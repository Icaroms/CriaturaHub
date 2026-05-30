class Criatura(val nome: String, val tipo: String, val nivel: Int)

fun main() {
    val a = Criatura("Bulbasaur", "Grama", 5)
    val b = Criatura("Bulbasaur", "Grama", 5)

    print(a)
    print(a == b)
}