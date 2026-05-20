fun main() {
    // val criaturas = listOf("Bulbasaur", "Charmander") - listOf é imutável
    val criaturas = mutableListOf("Bulbasaur", "Charmander")

    /*println("Total de Criaturas: ${criaturas.size}")
    println("Criatura: ${criaturas[0]}")
    println("Criatura: ${criaturas[3]}")
    for (criatura in criaturas) {println("$criatura tem ${criatura.length} letras no nome")} // criatura in criaturas = for-in */

    criaturas.add("Squirtle")
    for (criatura in criaturas) {println(criatura)}
}