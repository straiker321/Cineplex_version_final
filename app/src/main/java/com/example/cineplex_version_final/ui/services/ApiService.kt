package com.example.cineplex_version_final.ui.services





import com.example.cineplex_version_final.ui.model.Peliculas
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("pelicula/")
    fun getPeliculasDetalles() : Call<List<Peliculas>>
}