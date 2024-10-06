package mx.edu.utez.dondequedolabolita

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        // Referencias a los cuadros de texto y el botón
        val op1 = findViewById<EditText>(R.id.op1)
        val op2 = findViewById<EditText>(R.id.op2)
        val op3 = findViewById<EditText>(R.id.op3)
        val btnAdivina = findViewById<Button>(R.id.btnAdivina)
        val txvResult = findViewById<TextView>(R.id.txvResult)

        // Genera una posición aleatoria para la bola
        val randomPosition = (0..2).random()

        btnAdivina.setOnClickListener {
            // Verificar qué opción ha seleccionado el usuario
            val userAdv = when {
                op1.text.toString().isNotEmpty() -> 0
                op2.text.toString().isNotEmpty() -> 1
                op3.text.toString().isNotEmpty() -> 2
                else -> -1
            }

            if (userAdv == randomPosition) {
                txvResult.text = getString(R.string.correct_guess)
            } else {
                txvResult.text = getString(R.string.wrong_guess, randomPosition + 1)
            }
        }
    }
}