package com.example.cineplex_version_final.ui.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.cineplex_version_final.databinding.ItemComboBinding
import com.example.cineplex_version_final.ui.model.Combo

class ComboViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val binding = ItemComboBinding.bind(view)
    fun render(comboModel: Combo){
        binding.tvCombo.text = comboModel.nombre
        binding.tvPrecio.text = comboModel.precio
    }
}