package com.example.cineplex_version_final.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cineplex_prueba.ui.adapter.OnClickListener
import com.example.cineplex_version_final.R
import com.example.cineplex_version_final.ui.model.Cines


class CinesAdapter (private val listaCines : List<Cines>, private val onClickListener: OnClickListener) : RecyclerView.Adapter<CinesViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CinesViewHolder {
       val layoutInflater = LayoutInflater.from(parent.context)
        return CinesViewHolder(layoutInflater.inflate(R.layout.item_cines,parent,false))
    }

    override fun onBindViewHolder(holder: CinesViewHolder, position: Int) {
        val item = listaCines[position]
        holder.render(item)
        holder.itemView.setOnClickListener {
            onClickListener.onClickItemListener(position)
        }
    }

    override fun getItemCount(): Int = listaCines.size

}