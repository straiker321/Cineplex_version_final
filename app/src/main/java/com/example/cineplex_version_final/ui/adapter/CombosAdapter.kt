package com.example.cineplex_version_final.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cineplex_prueba.ui.adapter.OnClickListener
import com.example.cineplex_version_final.R
import com.example.cineplex_version_final.ui.model.Combo

class CombosAdapter (private val listaCombo : List<Combo>, private val onClickListener: OnClickListener) : RecyclerView.Adapter<ComboViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComboViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ComboViewHolder(layoutInflater.inflate(R.layout.item_combo,parent,false))
    }

    override fun onBindViewHolder(holder: ComboViewHolder, position: Int) {
        val item = listaCombo[position]
        holder.render(item)
        holder.itemView.setOnClickListener {
            onClickListener.onClickItemListener(position)
        }
    }

    override fun getItemCount(): Int  = listaCombo.size

}