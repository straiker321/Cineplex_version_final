package com.example.cineplex_version_final.ui.peliculas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cineplex_prueba.ui.adapter.OnClickListener
import com.example.cineplex_version_final.R
import com.example.cineplex_version_final.databinding.ActivityCinesBinding
import com.example.cineplex_version_final.databinding.ActivityComprarBinding
import com.example.cineplex_version_final.ui.adapter.CinesAdapter
import com.example.cineplex_version_final.ui.adapter.CinesProvider
import com.example.cineplex_version_final.ui.adapter.ComprarProvider
import com.example.cineplex_version_final.ui.adapter.ComprasAdapter
import com.example.cineplex_version_final.ui.carrito.Butaca_activity

class Comprar_activity : AppCompatActivity(), OnClickListener {
    private lateinit var binding: ActivityComprarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityComprarBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        binding.rvCompras.layoutManager = LinearLayoutManager(this)
        binding.rvCompras.adapter = ComprasAdapter(ComprarProvider.compraslist,this)
    }

    override fun onClickItemListener(position: Int) {
        val intent = Intent(this, Butaca_activity::class.java)
        startActivity(intent)
    }
}