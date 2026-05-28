// Pai com função GENÉRICA, marcada como 'open'
open class Animal(val nome: String) {
    // 'open fun' = 'filhas podem sobrescrever esta função'
    fun fazerSom() {
        println("$nome faz algum som genérico")
    }
}

class Gato(nome: String) : Animal(nome) {
    // 'override' = 'estou refazendo a função do pai do meu jeito'
    override fun fazerSom() {
        println("$nome faz: Miau!")
    }
}

class Cachorro(nome: String) : Animal(nome) {

    override fun fazerSom() {
        println("$nome faz: AuAu!")
    }
}

class Vaca(nome: String) : Animal(nome) {

    override fun fazerSom() {
        println("$nome faz: MuUuU!")
    }
}

class Cobra(nome: String) : Animal(nome)

// Classe que NÃO sobrescreve - usa a versão genérica do pai
class Peixe(nome: String) : Animal(nome)

fun main() {
    Gato("Frajola").fazerSom() // Miau!
    Cachorro("Rex").fazerSom() // AuAu!
    Peixe("Nemo").fazerSom() // Som Genérico - Peixe não deu override
    Cobra("Naja").fazerSom() // Som Genérico - Peixe não deu override
}