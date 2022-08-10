package com.example.cineplex_version_final.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cineplex_prueba.ui.adapter.OnClickListener
import com.example.cineplex_version_final.R
import com.example.cineplex_version_final.ui.model.Cines

class ComprasAdapter(private val listaCompras : List<Cines>, private val onClickListener: OnClickListener) : RecyclerView.Adapter<ComprarViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComprarViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ComprarViewHolder(layoutInflater.inflate(R.layout.item_compra,parent,false))
    }

    override fun onBindViewHolder(holder: ComprarViewHolder, position: Int) {
        val item = listaCompras[position]
        holder.render(item)
        holder.itemView.setOnClickListener {
            onClickListener.onClickItemListener(position)
        }
    }

    override fun getItemCount():  Int = listaCompras.size

}