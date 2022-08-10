package com.example.cineplex_version_final.ui.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

import com.example.cineplex_version_final.R
import com.example.cineplex_version_final.ui.model.Peliculas


class DetallesViewHolder (view: View): RecyclerView.ViewHolder(view) {
    val tvtitulo = view.findViewById<TextView>(R.id.tvtitulo)
    val tvsinopsis = view.findViewById<TextView>(R.id.tvsinopsis)

    fun render(detalles: Peliculas){
        tvtitulo.text = detalles.nombre
        tvsinopsis.text = detalles.sinopsis

    }
}