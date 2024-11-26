package mx.edu.utez.intents4f

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import mx.edu.utez.intents4f.databinding.ActivityMain2Binding
import mx.edu.utez.intents4f.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding:ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding=ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnRegresar.setOnClickListener{
            //intent claase que permite abrir componentes nuevos
            //1.Componentes origen (contexto)
            //2.Componente destino (::class.java)
            val intent= Intent(this@MainActivity2,MainActivity::class.java)
            finish()//cierra el activity
           /* intent.flags=Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
            Intent.FLAG_ACTIVITY_NEW_TASK*/
            startActivity(intent)
        }

        val valorRecibir=intent.getStringExtra("valor")
        binding.textView.text=valorRecibir
    }
}