MISSÃO 0.B.1 - 15/05/2026 ---------------------------------------------------------------------------------------------------------------------------------------------------------------------

1. Os dois exercícios foram resolvidos e executados sem erro no playground? [✓]
2. Commit feito no repositório CriaturaHub - pode ser um arquivo docs/kotlin-notas.md com os trechos resolvidos [✓]
2. Diário.md preenchido com os templates de 5 linhas, energia anotada [✓]
2. Próximo passo registrado no diário: "Começar missão 0.B.2, Funções e if/else [✓]

=============================== Código do Exercício ===========================================================================================================================================

fun main() {
    val nome = "Pikachu"
    val tipo = "Elétrico"
    val nivel = 12
    val capturada = true

    nivel = nivel + 1

    println("$nome | Tipo: $tipo | Nível: $nivel | Capturado: $capturada")
    println("$nome está no nível $nivel")
}

MISSÃO 0.B.2 - 16/05/2026 ---------------------------------------------------------------------------------------------------------------------------------------------------------------------

1. Os dois exercícios foram resolvidos e executados sem erro no playground? [✓]
2. Commit feito no repositório CriaturaHub - pode ser um arquivo docs/kotlin-notas.md com os trechos resolvidos [✓]
2. Diário.md preenchido com os templates de 5 linhas, energia anotada [✓]
2. Próximo passo registrado no diário: "Começar missão 0.C.1, Anatomia de Projeto Android [✓]

=============================== Código do Exercício ===========================================================================================================================================

fun nomeCompleto(pronome: String, sobrenome: String): String {

    return "$pronome $sobrenome"

}

fun main() {

    println(nomeCompleto("Icaro", "Matheus"))

    println(nomeCompleto("Donatello", "Rodrigues"))

    println(nomeCompleto("Juninho", "Pernambucano"))

}



fun ehMaiorDeIdade(idade: Int): String {

    return if (idade >= 18) {return "Sim, é maior de idade"}

    		else {return "Ainda não"}

}

fun eMaiorDeIdade(idade: Int): String {

    if (idade >= 18) {

        return "É maior de idade"

    } else {

        return "Ainda não"

    }

}

fun main() {

    println(ehMaiorDeIdade(13))

    println(ehMaiorDeIdade(17))

    println(ehMaiorDeIdade(18))

    println(ehMaiorDeIdade(19))

    println(ehMaiorDeIdade(23))

    println(eMaiorDeIdade(13))

    println(eMaiorDeIdade(17))

    println(eMaiorDeIdade(18))

    println(eMaiorDeIdade(19))

    println(eMaiorDeIdade(23))

}
