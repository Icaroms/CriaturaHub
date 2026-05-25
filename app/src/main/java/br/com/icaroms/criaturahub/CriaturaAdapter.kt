package br.com.icaroms.criaturahub

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CriaturaAdapter(private val listaDeCriaturas: List<Criatura>) :
        RecyclerView.Adapter<CriaturaAdapter.CriaturaViewHolder>() {

    class CriaturaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textNome: TextView = itemView.findViewById(R.id.textNome)
        val textNumero: TextView = itemView.findViewById(R.id.textTipo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : CriaturaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_criatura, parent, false)
        return CriaturaViewHolder(view)
    }

    override fun onBindViewHolder(holder: CriaturaViewHolder, position: Int) {
        val criatura = listaDeCriaturas[position]
        holder.textNome.text = criatura.nome
        holder.textNumero.text = "Tipo: ${criatura.tipo}"
    }

    override fun getItemCount(): Int {
        return listaDeCriaturas.size
    }
}