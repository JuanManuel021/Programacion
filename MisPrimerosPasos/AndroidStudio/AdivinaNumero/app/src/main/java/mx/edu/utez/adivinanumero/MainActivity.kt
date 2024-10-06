package mx.edu.utez.adivinanumero

import android.os.Bundle
import android.widget.Button
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

        val edtNumero = findViewById<TextView>(R.id.edtNumero)
        val edtIntento = findViewById<TextView>(R.id.edtIntento)
        val btnProbar = findViewById<Button>(R.id.btnProbar)
        val btnRendirse = findViewById<Button>(R.id.btnRendirse)
        val btnReiniciar = findViewById<Button>(R.id.btnReiniciar)
        val txtResultado=findViewById<TextView>(R.id.txtResultado)

        var valor = (0..100).random()
        var contador = 0

        btnProbar.setOnClickListener {
            if (edtNumero.text.toString() == "") {
                Toast.makeText(this@MainActivity, "Ingresa un numero correcto", Toast.LENGTH_SHORT).show()
            }
            else if (contador <= 10) {
                edtIntento.setText(contador.toString());

                contador = contador + 1
                if (valor >= edtNumero.text.toString().toInt()) {
                    Toast.makeText(this@MainActivity, "Tu numero es mayor", Toast.LENGTH_SHORT)
                        .show()

                } else {
                    Toast.makeText(this@MainActivity, "Tu numero es menor", Toast.LENGTH_SHORT)
                        .show()
                }



            }else{
                contador = 0
                valor = (0..100).random()
            }
        }

        btnRendirse.setOnClickListener {
            txtResultado.setText(valor.toString())
        }
        btnReiniciar.setOnClickListener {
            contador = 0
            valor = 0
        }
    }
    }



