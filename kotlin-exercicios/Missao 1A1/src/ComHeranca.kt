// 'open' libera essa classe para ser herdada. Sem 'open', dá erro.
/* open class Equipamentos(val nome: String, val peso: Int) {

    // Função comum a todo Equipamento - Escrita UMA vez
    fun descreveres() {
        println("$nome, pesa $peso kg")
    }
}

// 0 ':' significa 'Espada É UM TIPO DE Equipamento'.
// Os parênteses passam os valores para o construtor do pai.
class Espadas : Equipamentos(nome = "Espada", peso = 5)
class Escudos : Equipamentos(nome = "Escudo", peso = 8)

fun main() {
    Espadas().descreveres() // Herdou descrever() de graça
    Escudos().descreveres() // Herdou descrever() de graça
} */