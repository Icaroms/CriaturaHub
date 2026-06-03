import retrofit2.http.GET

// Modela o JSON: a PokéAPI devolve um objeto com a chave 'results',
// que é uma lista. Os nomes das propriedades batem com as chaves do JSON.
data class RespostaLista(
    val results: List<ResultadoCriatura>
)

data class ResultadoCriatura(
    val name: String, // Chave 'name' do JSON
    val url: String // Chave 'url' do JSON
)

// O CONTRATO: Diz O QUE existe, não COMO funciona.
interface PokeApi {
    @GET("pokemon?limit=5") // Faz GET nesse caminho, colado na baseUrl

    suspend fun listarCriaturas(): RespostaLista // suspend: é chamada de rede, demora
}