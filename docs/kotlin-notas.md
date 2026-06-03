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

MISSÃO 1.B.2 - 21/05/2026 ---------------------------------------------------------------------------------------------------------------------------------------------------------------------

1. Os dois exercícios aplicados no item_criatura.xml, conferidos no preview? [✓]
2. Commit no repositório? [✓]
3. diario.md preenchido com notas de energia? [✓]
4. roadmap.md atualizado ? [✓]

=============================== Código do Exercício ===========================================================================================================================================

<TextView
    android:id="@+id/textNivel"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Nível 0"
    android:textSize="14sp"
    android:textColor="#6B4A1F"
    android:layout_marginTop="4dp" />

Alterações no código:
1. android:padding="20dp"> 
2. android:textSize="20sp" 3. android:textColor="
#6B8E2E"

MISSÃO 1.B.3 - 22/05/2026 ---------------------------------------------------------------------------------------------------------------------------------------------------------------------

1. A Lista de 5 criaturas rodando no emulador(marco mínimo de hoje) [✓]
2. Os dois exercícios aplicados, se a energia segurou. se não, ficam pra consolidação [✓]
3. commit feito? [✓]
4. diário feito as anotações? [✓]
4. roadmap.md atualizado ? [✓]

=============================== Código do Exercício ===========================================================================================================================================

1. 
Criatura("Charizard", "Fogo", 48),
Criatura("Mewtwo", "Psíquico", 60),
Criatura("Cyndaquil", "Fogo", 8),
Criatura("Togepi", "Normal", 11)

- Adição de mais criaturas, para que fosse possível enxergar a rolagem

2. 
holder.textTipo.text = "Tipo: ${criatura.tipo}"
holder.textNivel.text = "Lv. ${criatura.nivel}"

- Ajuste do texto

MISSÃO 1.B.4 - 25/05/2026 ---------------------------------------------------------------------------------------------------------------------------------------------------------------------

1. Item da lista com dois textos, espaçamento e divisor rodando no emulador [✓]
2. commit feito? [✓]
3. diário feito as anotações? [✓]
4. Exercícios Feitos? [✓]
5. roadmap.md atualizado ? [✓]

=============================== Código do Exercício ===========================================================================================================================================

item_criatura.xml:

android:id="@+id/textTipo"
android:text="Tipo: "

Criatura.kt:
class Criatura(val nome: String, val tipo: String)

MainActivity:
val criaturas = listOf(
            Criatura("Bulbasaur", "Grama"))

CriaturaAdapter.kt:
        val textNumero: TextView = itemView.findViewById(R.id.textTipo)
        holder.textNumero.text = "Tipo: ${criatura.tipo}"

MISSÃO 1.C.1 - 25/05/2026 ---------------------------------------------------------------------------------------------------------------------------------------------------------------------

1. Diário de campo preenchido com a nota de energia da sessão [✓]
2. resposta da Reflexão anotadas (ajudam a 1.C.2 a começar mais rápido) [✓]
3. Commit [✓]

=============================== Código do Exercício ===========================================================================================================================================

Moldura e Quadro 1. Moldura Séria: 1. Interface 2. Botões 2. Quadro Séria: 1. Criaturas/Capturadas 2. Dados(Treinador/Criatura) *Incorreto*
Activities é uma entidade muitp pesada, gerenciado pelo S.O. do próprio android, e ter vários seria extremamente problático futuramente
Configuração: Nav Graph, Execução: Nav Controller

MISSÃO 1.C.2 - 26/05/2026 ---------------------------------------------------------------------------------------------------------------------------------------------------------------------

1. App roda e mostra a lista, agora servida pelo ListaFragment via NavHost [✓]
2. Commit [✓]
3. Diário preenchido [✓]
4. Exercícios resolvidos [✓]

=============================== Código do Exercício ===========================================================================================================================================

1. android:label="Criaturas da Guilda"
2. 1.onCreateView 2.onViewCreated 3.onViewCreated 4.onCreateView

MISSÃO 1.C.3 - 27/05/2026 ---------------------------------------------------------------------------------------------------------------------------------------------------------------------

1. App roda, lista aparece, toque numa criatura abre o detalhe, botão "voltar" retorna para lista.[✓]
2. Commit [✓]
3. Diário preenchido [✓]
4. Exercícios resolvidos [✓]

=============================== Código do Exercício ===========================================================================================================================================

1. não entendi como faço o teste de criatura desconhecida no Elvis
val nomeRecebido = arguments?.getString("nomeCriatura") ?: "Criatura Desconhecida"

2. 
Toast.makeText(requireContext(), "Tocou em ${criaturaClicada.nome}", Toast.LENGTH_SHORT).show()

// Pega o NavController e dispara a action lista -> detalhe.
findNavController().navigate(
    R.id.action_lista_to_detalhe, argumentos)

MISSÃO 1.D.1 - 30/05/2026 ---------------------------------------------------------------------------------------------------------------------------------------------------------------------

1. Criatura.kt virou data class e o app roda igual? [✓]
2. Commit [✓]
3. Diário preenchido [✓]
4. Exercícios resolvidos [✓]

=============================== Código do Exercício ===========================================================================================================================================

1. não entendi como faço o teste de criatura desconhecida no Elvis
val nomeRecebido = arguments?.getString("nomeCriatura") ?: "Criatura Desconhecida"

2. 
Toast.makeText(requireContext(), "Tocou em ${criaturaClicada.nome}", Toast.LENGTH_SHORT).show()

// Pega o NavController e dispara a action lista -> detalhe.
findNavController().navigate(
    R.id.action_lista_to_detalhe, argumentos)

MISSÃO 1.D.1 - 01/06/2026 ---------------------------------------------------------------------------------------------------------------------------------------------------------------------

1. Os dois exercícios rodaram e tu entendeu a ordem da saída? [✓]
2. Commit [✓]
3. Diário preenchido [✓]

=============================== Código do Exercício ===========================================================================================================================================

1. import kotlinx.coroutines.*

// Nossa própria função que "demora"; Precisa de suspend porque chama delay
suspend fun procurarCriatura(nome: String, demora: Long) {

    delay(demora) // Finge o tempo de resposta da PokéAPI

    println("$nome" + " chegou da Guilda Antiga")
}

fun mains() = runBlocking {
    println("Início da busca")
    launch { procurarCriatura("Charmander", 1000)} // dispara uma corrotina e NÃO espera ela terminar
    launch { procurarCriatura("Squirtle", 500)} // dispara outra; as duas correm ao mesmo tempo
    launch { procurarCriatura("Pikachu", 1500)}
    println("Pedidos enviados, esperando respostas...")
}

2. import kotlinx.coroutines.*

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

MISSÃO 1.D.1 - 01/06/2026 ---------------------------------------------------------------------------------------------------------------------------------------------------------------------

1. O Logcat mostrou as criaturas reais chegando(Rodou e viu com os próprios olhos)? [✓]
2. Commit [✓]
3. Diário preenchido [✓]

=============================== Código do Exercício ===========================================================================================================================================

1. @GET("pokemon?limit=5") // Faz GET nesse caminho, colado na baseUrl

2. Log.d("CriaturaHub", "URL: " + resposta.results[0].url)