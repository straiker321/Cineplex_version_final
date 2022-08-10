package com.example.cineplex_version_final.ui.adapter

import com.example.cineplex_version_final.ui.model.Peliculas

class PeliculaProvider {
    companion object{
        val  pelislist= listOf<Peliculas>(
            Peliculas(
                "Terminator",
                "3.2hr",
                "2022-04-10",
                "Accion",
                "https://i.blogs.es/e9aa3d/terminator-genesis-cartel/450_1000.jpg",
                "null"

                ),
            Peliculas(
                "Son como niños 2",
                "2.5hr",
                "2020-05-12",
                "Comedia",
                "https://mx.web.img3.acsta.net/pictures/20/07/07/00/55/1740448.jpg",
                "null"
                ),

        )
    }
}