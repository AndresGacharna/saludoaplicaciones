package com.example.saludobienhecho

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSaludar: Button = findViewById(R.id.button)
        val etIngresaUser: EditText = findViewById(R.id.editTextText)
        val msjSaludo: TextView = findViewById(R.id.textView2)

        btnSaludar.setOnClickListener {
            /* msjSaludo.text = "Botón presionado" */

            msjSaludo.text = getString(R.string.ma_no_estas_registrado, etIngresaUser.text.toString())
        }
    }
}