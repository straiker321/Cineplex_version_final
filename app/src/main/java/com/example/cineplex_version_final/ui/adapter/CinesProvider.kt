package com.example.cineplex_version_final.ui.adapter

import com.example.cineplex_version_final.ui.model.Cines


class CinesProvider {
    companion object{
        val  cineslist= listOf<Cines>(
            Cines(
                "CP Alcazar",
                "Av.Santa Cruz 814-816",
                "2D,REGULAR,3D",


            ),
            Cines(
                "CP Arequipa Mall Plaza",
                "Av.Ejercito 793 Cayma",
                "2D,3D,REGULAR",


            ),
        )
    }
}