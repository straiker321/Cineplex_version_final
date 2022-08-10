package com.example.cineplex_version_final.ui.peliculas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cineplex_prueba.ui.adapter.OnClickListener
import com.example.cineplex_prueba.ui.adapter.PeliculaAdapter
import com.example.cineplex_version_final.R
import com.example.cineplex_version_final.databinding.ActivityPeliculasBinding
import com.example.cineplex_version_final.ui.adapter.CinesAdapter
import com.example.cineplex_version_final.ui.adapter.CinesProvider
import com.example.cineplex_version_final.ui.adapter.DetallesViewHolder
import com.example.cineplex_version_final.ui.adapter.PeliculaProvider
import com.example.cineplex_version_final.ui.model.Peliculas
import com.example.cineplex_version_final.ui.services.ApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PeliculasActivity : AppCompatActivity(),OnClickListener {
    private lateinit var binding: ActivityPeliculasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPeliculasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()

    }

    private fun initRecyclerView() {
        binding.rvpeliculas.layoutManager = LinearLayoutManager(this)
        binding.rvpeliculas.adapter = PeliculaAdapter(PeliculaProvider.pelislist,this)
    }


    override fun onClickItemListener(position: Int) {
        val intent = Intent(this, Verdetalles_activity::class.java)
        startActivity(intent)
    }


}