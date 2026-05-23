package br.com.icaroms.criaturahub

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val criaturas = listOf(
            Criatura("Bulbasaur", "Grama", 5),
            Criatura("Chamander", "Fogo", 8),
            Criatura("Squirtle", "Água", 6),
            Criatura("Pikachu", "Elétrico", 12),
            Criatura("Snorlax", "Normal", 30),
            Criatura("Charizard", "Fogo", 48),
            Criatura("Mewtwo", "Psíquico", 60),
            Criatura("Cyndaquil", "Fogo", 8),
            Criatura("Togepi", "Normal", 11)
        )

        val recycler = findViewById<RecyclerView>(R.id.recyclerCriaturas)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = CriaturaAdapter(criaturas)
    }
}