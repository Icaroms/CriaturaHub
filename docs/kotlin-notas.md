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

MISSÃO 1.C.1 - 19/05/2026 ---------------------------------------------------------------------------------------------------------------------------------------------------------------------

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

MISSÃO 1.C.2 - 20/05/2026 ---------------------------------------------------------------------------------------------------------------------------------------------------------------------

1. Os dois exercícios rodandando sem erro? [✓]
2. Commit no repositório? [✓]
3. diario.md preenchido com template fixo? [✓]
4. roadmap.md atualizado ? [✓]

=============================== Código do Exercício ===========================================================================================================================================

class  Item(val nome: String, val quantidade: Int)

fun main() {
    val pocao = Item("Poção", 5)
    val pokebola = Item("Pokébola", 10)
    val repelente = Item("Repelente", 2)

    val mochila = listOf(pocao, pokebola, repelente)

    for (item in mochila) {
        println("${item.quantidade}x ${item.nome}")
    }
}
----
class Criaturas(val nome: String, val tipo: String, val nivel: Int)

fun main() {
    val snorlax = Criaturas("Snorlax", "Normal", 55)
    val charizard = Criaturas("Charizard", "Fogo", 42)
    val mewtwo = Criaturas("Mewtwo", "Psíquico", 62)
    val cyndaquil = Criaturas("Cyndaquil", "Fogo", 8)
    val lapras = Criaturas("Lapras", "Água", 33)

    val capturadas = listOf(snorlax, charizard, mewtwo, cyndaquil, lapras)

    for (c in capturadas) {
        if (c.nivel > 30) {
            println("${c.nome} (${c.tipo}) está pronta para batalha.")
        }
    }
}

MISSÃO 1.B.1 - 21/05/2026 ---------------------------------------------------------------------------------------------------------------------------------------------------------------------

1. Os dois exercícios respondido no diário? [✓]
2. Commit no repositório? [✓]
3. diario.md preenchido com notas de energia? [✓]
4. roadmap.md atualizado ? [✓]

=============================== Código do Exercício ===========================================================================================================================================

1) Qual é qual:
    1. Saber qual a lista tem 1000 criaturas: Adapter
    2. Seguras os TextView de uma única linha da lista: ViewHolder
    3. Decidir se a lista aparece como coluna única ou grade de duas colunas: LayoutManager
    4. Gerenciar a rolagem e reaproveitar as molduras que saem da tela: RecyclerView
    5. Pegar a criatura da posição 13 e colocar os dados dela numa moldura: adapter?

2) Exemplos do dia-a-dia sobre reciclagem:
    Eu gosto de action figure, e muitos desses bonecos tem peças quase sempre reaproveitadas, por exemplo, imagine a dificuldade e o gasto em modelar 1000 personagens únicos, sendo que muitos tem formatos iguais, apenas detalhes diferentes, então é mais fácil ter 10 modelos de partes diferentes e montar um personagem único com essas partes reaproveitadas, economizando custos(acredito que isso seja um bom exemplo, talvez)