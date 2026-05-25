package br.com.icaroms.criaturahub

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val criaturas = listOf(
            Criatura("Bulbasaur", "Grama"),
            Criatura("Chamander", "Fogo"),
            Criatura("Squirtle", "Água"),
            Criatura("Pikachu", "Elétrico"),
            Criatura("Snorlax", "Normal"),
            Criatura("Charizard", "Fogo"),
            Criatura("Mewtwo", "Psíquico"),
            Criatura("Cyndaquil", "Fogo"),
            Criatura("Togepi", "Normal")
        )

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerCriaturas)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CriaturaAdapter(criaturas)

        val divisor = DividerItemDecoration(
            recyclerView.context,
            DividerItemDecoration.VERTICAL
        )

        recyclerView.addItemDecoration(divisor)
    }
}