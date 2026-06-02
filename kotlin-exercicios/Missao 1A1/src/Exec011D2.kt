import kotlinx.coroutines.*

// Nossa própria função que "demora"; Precisa de suspend porque chama delay
suspend fun procurarCriatura(nome: String, demora: Long) {

    delay(demora) // Finge o tempo de resposta da PokéAPI

    println("$nome" + " chegou da Guilda Antiga")
}

fun main() = runBlocking {
    println("Início da busca")
    launch { procurarCriatura("Charmander", 1000)} // dispara uma corrotina e NÃO espera ela terminar
    launch { procurarCriatura("Squirtle", 500)} // dispara outra; as duas correm ao mesmo tempo
    launch { procurarCriatura("Pikachu", 1500)}
    println("Pedidos enviados, esperando respostas...")
}