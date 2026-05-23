package br.com.icaroms.criaturahub

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CriaturaAdapter(private val criaturas: List<Criatura>) :
        RecyclerView.Adapter<CriaturaAdapter.CriaturaViewHolder>() {

    class CriaturaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textNome: TextView = itemView.findViewById(R.id.textNome)
        val textTipo: TextView = itemView.findViewById(R.id.textTipo)
        val textNivel: TextView = itemView.findViewById(R.id.textNivel)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : CriaturaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_criatura, parent, false)
        return CriaturaViewHolder(view)
    }

    override fun onBindViewHolder(holder: CriaturaViewHolder, position: Int) {
        val criatura = criaturas[position]
        holder.textNome.text = criatura.nome
        holder.textTipo.text = "Tipo: ${criatura.tipo}"
        holder.textNivel.text = "Lv. ${criatura.nivel}"
    }

    override fun getItemCount(): Int {
        return criaturas.size
    }
}