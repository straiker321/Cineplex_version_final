package com.example.cineplex_version_final.ui.Dulceria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cineplex_version_final.R
import com.example.cineplex_version_final.ui.carrito.Combos_activity

class Dulceria_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dulceria)
        val btn_combos=findViewById<Button>(R.id.btn_combos)
        btn_combos.setOnClickListener{
            val lanzar = Intent(this, Combos_activity::class.java)
            startActivity(lanzar)
        }
    }

}