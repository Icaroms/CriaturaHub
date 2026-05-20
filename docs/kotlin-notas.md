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

MISSÃO 0.B.2 - 16/05/2026 ---------------------------------------------------------------------------------------------------------------------------------------------------------------------

1. O app roda no emulador, mostra TextView e Button, e o Button modifica o texto ao ser clicado? [✓]
2. Os dois exercícios foram aplicados - segundo botão "Restar" funcional e o primeiro botão mudando o próprio texto? [✓]
3. Commit grande no repositório? [✓]
4. diario.md preenchido - energia anotada com honestidade. Está é a quarta sessão de estudo em dois dias; a nota de energia importa especialmente hoje para acompanhamento. ? [✓]
5. Próximo passo registrado no diário: "Relaxa no domingo...e retorna mais forte na segunda para Missão 1.A.1 - List<T> em kotlin, abertura da Fase 1 [✓]

=============================== Código do Exercício ===========================================================================================================================================

<Button
    android:id="@+id/botaoReset"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Resetar"
    android:layout_marginTop="24dp"
    app:layout_constraintTop_toBottomOf="@id/botaoSaudacao"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintEnd_toEndOf="parent" />
val botaoReset = findViewById<Button>(R.id.botaoReset)

botaoReset.setOnClickListener {
            texto.text = "Patente: Recruta"
            botaoSaudar.text = "Saudar Guilda"
        }
botaoSaudar.setOnClickListener {
    texto.text = "Bem-vindo, Caçador!"
    botaoSaudar.text = "Saudado!"
}

MISSÃO 0.B.2 - 19/05/2026 ---------------------------------------------------------------------------------------------------------------------------------------------------------------------

1. Os dois exercícios rodandando sem erro? [✓]
2. Commit no repositório? [✓]
3. diario.md preenchido com template fixo? [✓]
4. roadmap.md atualizado ? [✓]

=============================== Código do Exercício ===========================================================================================================================================

fun main() {
    val tipos = listOf("Grama", "Fogo", "Água", "Elétrico")

    println("A Guilda conhece ${tipos.size} tipos.")
    for (tipo in tipos) {println("Tipo descoberto: $tipo")}

    val niveis = listOf(15, 42, 8, 67, 30, 55)

    for (nivel in niveis) {
        if (nivel > 30) {
            println("Nível alto detectado: $nivel")
        }
    }
}