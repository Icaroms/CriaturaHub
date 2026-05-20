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