import kotlinx.coroutines.*

// Nossa própria função que "demora"; Precisa de suspend porque chama delay
suspend fun buscarCriatura(nome: String, demora: Long) {

    delay(demora) // Finge o tempo de resposta da PokéAPI

    println("$nome" + " chegou da Guilda Antiga")
}

fun mains() = runBlocking {
    println("Início da busca")
    launch { buscarCriatura("Charmander", 1000)} // dispara uma corrotina e NÃO espera ela terminar
    launch { buscarCriatura("Squirtle", 500)} // dispara outra; as duas correm ao mesmo tempo
    println("Pedidos enviados, esperando respostas...")
}