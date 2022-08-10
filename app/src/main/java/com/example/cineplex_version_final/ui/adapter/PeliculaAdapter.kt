package com.example.cineplex_prueba.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cineplex_version_final.R
import com.example.cineplex_version_final.ui.adapter.PeliculasViewHolder
import com.example.cineplex_version_final.ui.model.Peliculas


class PeliculaAdapter(private val listaPelicula: List<Peliculas>, private val onClickListener: OnClickListener) : RecyclerView.Adapter<PeliculasViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeliculasViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PeliculasViewHolder(layoutInflater.inflate(R.layout.item_peliculas, parent, false)
        )

    }

    override fun onBindViewHolder(holder: PeliculasViewHolder, position: Int) {
        val item = listaPelicula[position]
        holder.render(item)
        holder.itemView.setOnClickListener {
            onClickListener.onClickItemListener(position)
        }
    }

    override fun getItemCount(): Int {
        return listaPelicula.size
    }
}