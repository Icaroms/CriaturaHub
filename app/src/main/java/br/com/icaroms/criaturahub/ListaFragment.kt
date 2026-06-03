package br.com.icaroms.criaturahub

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ListaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        saveInstanceState: Bundle?
    ) : View? {
        return inflater.inflate(R.layout.fragment_lista, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 1) Monta o Retrofit - a "Fábrica" que constrói o contrato
        val retrofit = Retrofit.Builder()
            .baseUrl("https://pokeapi.co/api/v2/") // Endereço base; o @GET gruda aqui
            .addConverterFactory(GsonConverterFactory.create()) // usa Gson para traduzir o JSON
            .build()

        // 2) Pede para o Retrofit implementar o contrato PokeApi
        val api = retrofit.create(PokeApi::class.java)

        // 3) Dispara a chamada numa corrotina (igual ao launch da 1.D.2)
        lifecycleScope.launch {
            val resposta = api.listarCriaturas() // AQUI a corrotina suspende e espera a rede

            Log.d("CriaturaHub", "Recebi " + resposta.results.size + " criaturas")
            Log.d("CriaturaHub", "Primeira: " + resposta.results[0].name)
            Log.d("CriaturaHub", "URL: " + resposta.results[0].url)
        }

        val criaturas = listOf(
            Criatura("Snorlax", "Normal", 22),
            Criatura("Charizard", "Fogo", 45),
            Criatura("Squirtle", "Água", 6),
            Criatura("Bulbasaur", "Grama", 11),
            Criatura("Pikachu", "Elétrico", 10),
            Criatura("Articuno", "Gelo", 60),
            Criatura("Lucario", "Lutador", 38),
            Criatura("Rayquaza", "Voador", 61),
            Criatura("Mewtwo", "Psíquico", 59),
            Criatura("Scyther", "Inseto", 32),
            Criatura("Onix", "Pedra", 43),
            Criatura("Groudon", "Terra", 64),
            Criatura("Gengar", "Fantasma", 37),
            Criatura("Dragonite", "Dragão", 44),
            Criatura("Darkrai", "Sombrio", 68),
            Criatura("Muk", "Veneno", 33),
            Criatura("Sylveon", "Fada", 35),
            Criatura("Terapagos", "Stellar", 16)

        )

        val recycler = view.findViewById<RecyclerView>(R.id.recyclerCriaturas)
        recycler.layoutManager = LinearLayoutManager(requireContext())

        // MUDANÇA: passar a lambda `aoClicar` como segundo parâametro do Adapter.
        recycler.adapter = CriaturaAdapter(criaturas) {criaturaClicada ->
            // Está é a lambda. Roda toda vez que o Adapter chamar ao Clicar(...).
            // 'criaturaClicada' é o argumento que Adapter passou(uma Criatura).

            // Empacota o nome num Bundle, do jeito que o nav graph espera.
            val argumentos = Bundle().apply {
                putString("nomeCriatura", criaturaClicada.nome)
            }

            Toast.makeText(requireContext(), "Tocou em ${criaturaClicada.nome}", Toast.LENGTH_SHORT).show()

            // Pega o NavController e dispara a action lista -> detalhe.
            findNavController().navigate(
                R.id.action_lista_to_detalhe, argumentos
            )
        }
    }
}