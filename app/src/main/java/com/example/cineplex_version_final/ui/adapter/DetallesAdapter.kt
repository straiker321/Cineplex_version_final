package com.example.cineplex_version_final.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cineplex_version_final.R
import com.example.cineplex_version_final.ui.model.Peliculas


class DetallesAdapter(private val detalles: List<Peliculas>) : RecyclerView.Adapter<DetallesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetallesViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return DetallesViewHolder(layoutInflater.inflate(R.layout.item_detalles, parent, false)
        )
    }

    override fun onBindViewHolder(holder: DetallesViewHolder, position: Int) {
        val item = detalles[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
        return detalles.size
    }
}