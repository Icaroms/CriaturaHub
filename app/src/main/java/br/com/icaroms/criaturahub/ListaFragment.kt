package br.com.icaroms.criaturahub

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

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
        recycler.adapter = CriaturaAdapter(criaturas)
    }
}