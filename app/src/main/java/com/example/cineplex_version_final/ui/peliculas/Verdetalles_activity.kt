package com.example.cineplex_version_final.ui.peliculas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cineplex_prueba.ui.adapter.PeliculaAdapter
import com.example.cineplex_version_final.R
import com.example.cineplex_version_final.databinding.ActivityCinesBinding
import com.example.cineplex_version_final.databinding.ActivityPeliculasBinding
import com.example.cineplex_version_final.databinding.ActivityVerdetallesBinding
import com.example.cineplex_version_final.ui.adapter.DetallesAdapter
import com.example.cineplex_version_final.ui.model.Peliculas
import com.example.cineplex_version_final.ui.services.ApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Verdetalles_activity : AppCompatActivity() {
    private lateinit var binding: ActivityVerdetallesBinding
    lateinit var service: ApiService
    lateinit var rvdetalles: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerdetallesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val btn_comprar=findViewById<Button>(R.id.btn_comprar)
        btn_comprar.setOnClickListener{
            val lanzar = Intent(this,Comprar_activity::class.java)
            startActivity(lanzar)
        }
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("http://192.168.0.105:8070/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        rvdetalles = findViewById(R.id.rvdetalles)
        rvdetalles.layoutManager = LinearLayoutManager(this)
        service = retrofit.create<ApiService>(ApiService::class.java)
        obtenerLista()
    }

    private fun obtenerLista() {
        service.getPeliculasDetalles().enqueue(object : Callback<List<Peliculas>> {
            override fun onResponse(
                call: Call<List<Peliculas>>,
                response: Response<List<Peliculas>>
            ) {
                val detalles = response?.body()
                rvdetalles.adapter = DetallesAdapter(detalles!!)
            }

            override fun onFailure(call: Call<List<Peliculas>>, t: Throwable) {
                t?.printStackTrace()
            }

        })
    }
}