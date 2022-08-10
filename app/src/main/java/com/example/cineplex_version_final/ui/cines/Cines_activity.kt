package com.example.cineplex_version_final.ui.cines

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cineplex_prueba.ui.adapter.OnClickListener
import com.example.cineplex_version_final.R
import com.example.cineplex_version_final.databinding.ActivityCinesBinding
import com.example.cineplex_version_final.ui.adapter.CinesAdapter
import com.example.cineplex_version_final.ui.adapter.CinesProvider
import com.example.cineplex_version_final.ui.peliculas.PeliculasActivity

class Cines_activity : AppCompatActivity(), OnClickListener {
    private lateinit var binding: ActivityCinesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCinesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        binding.rvCines.layoutManager = LinearLayoutManager(this)
        binding.rvCines.adapter = CinesAdapter(CinesProvider.cineslist,this)
    }

    override fun onClickItemListener(position: Int) {
        val intent = Intent(this, PeliculasActivity::class.java)
        startActivity(intent)
    }
}