package com.example.suma4f

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
       setContentView(R.layout.activity_linear)

        val edtN1= findViewById<EditText>(R.id.edtN1)
        val edtN2=findViewById<EditText>(R.id.edtN2)
        val txtResultado=findViewById<TextView>(R.id.txtResultado)
        val btnSumar=findViewById<Button>(R.id.btnSumar)

        btnSumar.setOnClickListener{
            val resultado=edtN1.text.toString().toInt()+ edtN2.text.toString().toInt()
            txtResultado.text=resultado.toString()
        }
    }
}