open class Equipamento (val nome: String, val peso: Int) {

    open fun descrever() {
        println("$nome, pesa $peso kg")
    }
}

class Espada : Equipamento(nome = "Espada", peso = 5)
class Escudo : Equipamento(nome = "Escudo", peso = 8)
class Armadura : Equipamento(nome = "Armadura", peso = 12)

fun main() {
    Espada().descrever()
    Escudo().descrever()
    Armadura().descrever()
}