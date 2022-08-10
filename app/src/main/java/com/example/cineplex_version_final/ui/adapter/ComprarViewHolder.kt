package com.example.cineplex_version_final.ui.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.cineplex_version_final.databinding.ItemCinesBinding
import com.example.cineplex_version_final.databinding.ItemCompraBinding
import com.example.cineplex_version_final.ui.model.Cines

class ComprarViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val binding = ItemCompraBinding.bind(view)
    fun render(comprarModel: Cines){
        binding.tvNombre.text = comprarModel.nombre
        binding.tvUbicacion.text = comprarModel.ubicacion
        binding.tvGenero.text = comprarModel.genero

    }
}