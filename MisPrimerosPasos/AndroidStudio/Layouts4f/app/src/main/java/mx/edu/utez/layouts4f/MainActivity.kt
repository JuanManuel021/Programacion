package mx.edu.utez.layouts4f

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.actuvity_linear)
        val edtUsuario = findViewById<EditText>(R.id.edtUsuario)
        val edtPassword = findViewById<EditText>(R.id.edtPassword)
        val btnIniciar = findViewById<Button>(R.id.btnIniciar)
        val btnResgistrar = findViewById<Button>(R.id.btnRegistrar)
        val txtMensaje=findViewById<TextView>(R.id.txtMensaje)

        btnIniciar.setOnClickListener{
            //1. Contexto 2. Texto 3.Duracion
            Toast.makeText(this@MainActivity, edtUsuario.text.toString() ,Toast.LENGTH_SHORT).show()
        //TextView, EditText
            //get
            txtMensaje.text
            edtUsuario.text.toString()
            //set
            txtMensaje.text="Hola"
            edtUsuario.setText("Hola")
        }




    }
}