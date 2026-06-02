// Traz suspend, launch, delay, runBlocking pro nosso código
import kotlinx.coroutines.*

fun main() = runBlocking { // Abre um "mundo de corrotina" e segura o main até tudo terminar

    println("Buscando Criatura...") // Imprime imediatamente
    delay(5000) // ESPERA 5 segundos(5000 ms) sem travar o programa

    println("Bulbasaur Apareceu!") // Só roda DEPOIS da espera
}