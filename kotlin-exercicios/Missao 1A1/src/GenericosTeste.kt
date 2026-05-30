// Lista de String - só aceita textos
val nomes: List<String> = listOf("Bulbasaur", "Charmander", "Squirtle")

// Lista de Int - só aceita inteiros
val niveis: List<Int> = listOf(5, 8, 6)

fun main() {

    // O compilador SABE que cada item é String, então .length funciona:
    for(nome in nomes) {
        println("$nome tem ${nome.length} letras")
    }

    // O compilador SABE que cada item é Int, então pode somar:
    val somaNiveis = niveis.sum()
    println("Soma dos níveis: $somaNiveis")

    // Se você tentar misturar tipos, o compilado reclama ANTES do programa rodar:
    // val mistura: List<String> = listOf("a", 5, "b") // ERRO de compilação
}