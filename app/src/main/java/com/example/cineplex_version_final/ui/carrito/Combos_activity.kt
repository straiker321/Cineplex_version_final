package com.example.cineplex_version_final.ui.carrito

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cineplex_prueba.ui.adapter.OnClickListener
import com.example.cineplex_version_final.R
import com.example.cineplex_version_final.databinding.ActivityCinesBinding
import com.example.cineplex_version_final.databinding.ActivityCombosBinding
import com.example.cineplex_version_final.ui.adapter.*
import com.example.cineplex_version_final.ui.peliculas.PeliculasActivity

class Combos_activity : AppCompatActivity() ,OnClickListener{
    private lateinit var binding: ActivityCombosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCombosBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        binding.rvCombo.layoutManager = LinearLayoutManager(this)
        binding.rvCombo.adapter = CombosAdapter(ComboProvider.combolist,this)
    }

    override fun onClickItemListener(position: Int) {
        val intent = Intent(this, FDP_activity::class.java)
        startActivity(intent)
    }
}