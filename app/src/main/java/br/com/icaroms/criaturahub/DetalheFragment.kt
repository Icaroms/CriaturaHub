package br.com.icaroms.criaturahub

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class DetalheFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Tradutor 4 (Ciclo de Vida): construir a tela e devolver
        return inflater.inflate(R.layout.fragment_detalhe, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Tela já existe, hora de mobiliar

        // Pega o argumento que veio da navegação(Vamos configurar isso no nav graph)
        // 'arguments' é uma propriedade que todo Fragment tem - um Bundle? que
        // guarda o que foi passado na hora de navegar para cá.
        val nomeRecebido = arguments?.getString("nomeCriatura") ?: "Criatura Desconhecida"

        // Busca a Criatura na lista hardcoded pelo nome.
        // (Mesma lista da 1.C.2 - Solução temporária até o PokéAPI entrar na 1.D.)
        val todas = listOf(
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
        val criatura = todas.find {it.nome == nomeRecebido}

        // Preenche os três TextViews. ?. é o tradutor 3.A: Só chama se não for null.
        view.findViewById<TextView>(R.id.textNomeDetalhe).text = criatura?.nome
        view.findViewById<TextView>(R.id.textTipoDetalhe).text = "Tipo: ${criatura?.tipo}"
        view.findViewById<TextView>(R.id.textNivelDetalhe).text = "Nível: ${criatura?.nivel}"
    }
}