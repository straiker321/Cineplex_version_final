package com.example.cineplex_version_final.ui.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.cineplex_version_final.databinding.ItemCinesBinding
import com.example.cineplex_version_final.ui.model.Cines


class CinesViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val binding = ItemCinesBinding.bind(view)
    fun render(cinesModel: Cines){
        binding.tvNombre.text = cinesModel.nombre
        binding.tvUbicacion.text = cinesModel.ubicacion
        binding.tvGenero.text = cinesModel.genero

    }
}