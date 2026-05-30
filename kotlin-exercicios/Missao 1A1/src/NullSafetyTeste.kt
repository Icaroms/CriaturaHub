// Variável que não pode ser null (sem o ?)
val nome: String = "Bulbasaur"
// val nome: String = null // <- isso daria ERRO de compilação

// Variável que PODE ser null (com o ?)
val apelido: String? = null // permitido por causa do ?

fun main() {
    println(nome.length) // OK - nome NUNCA é null, pode ser direto

    // println(apelido.length) // <- ERRO? E se apelido for null?

    // Pra usar apelido, tem que verificar antes?
    if (apelido != null) {
        println(apelido.length) // agora pode - dentro do if, garantido não-null
    }

    // Atalho: ?. (safe call) - só chama .length SE não for null
    println(apelido?.length) //  imprime "null" se apelido for null
}