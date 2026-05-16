package br.com.icaroms.criaturahub

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val texto = findViewById<TextView>(R.id.textoBoasVindas)
        val botaoSaudar = findViewById<Button>(R.id.botaoSaudacao)
        val botaoReset = findViewById<Button>(R.id.botaoReset)

        botaoSaudar.setOnClickListener {
            texto.text = getString(R.string.saudacao)
            botaoSaudar.text = "Saudado!"
        }

        botaoReset.setOnClickListener {
            texto.text = getString(R.string.patente_atual)
            botaoSaudar.text = getString(R.string.botao_saudar)
        }
    }
}