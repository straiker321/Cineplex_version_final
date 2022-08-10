package com.example.cineplex_version_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.cineplex_version_final.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth

class Login_activity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()
        binding.btnRegistrar.setOnClickListener {
            val intent = Intent(this, Register_activity::class.java)
            startActivity(intent)
        }
        binding.btnInicar.setOnClickListener {
            val email = binding.email.text.toString()
            val password = binding.password.text.toString()
            if(email.isNotEmpty() && password.isNotEmpty()){
                    firebaseAuth.signInWithEmailAndPassword(email , password).addOnCompleteListener {
                        if (it.isSuccessful){
                            val intent = Intent(this, Register_activity::class.java)
                            startActivity(intent)
                        }else{
                            Toast.makeText(this, it.exception.toString(),Toast.LENGTH_SHORT).show()
                        }
                    }

            }else{
                Toast.makeText(this,"empty fields are not Allowed !!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}