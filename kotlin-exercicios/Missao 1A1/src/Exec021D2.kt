import kotlinx.coroutines.*

suspend fun forjarItem(nome: String) {

    delay(8000)
    println("Item Forjado: $nome")
}

fun main() = runBlocking {
    println("Iniciando Forja...")
    launch {forjarItem("Escudo de Radamanthys")}
    launch {forjarItem("Excalibur")}
    println("Item sendo Forjado...Brasas esquentando...")
}