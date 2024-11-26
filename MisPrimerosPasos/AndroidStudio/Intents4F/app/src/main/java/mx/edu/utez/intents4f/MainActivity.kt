package mx.edu.utez.intents4f

import android.content.Intent
import android.os.Bundle
import android.provider.Telephony.Mms.Intents
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import mx.edu.utez.intents4f.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
binding.btnSiguiente.setOnClickListener{
    //intent claase que permite abrir componentes nuevos
    //1.Componentes origen (contexto)
    //2.Componente destino (::class.java)
    val intent= Intent(this@MainActivity,MainActivity2::class.java)
    intent.putExtra("valor",binding.edtValor.text.toString())
    //Stack de activitis
    intent.flags=Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
    Intent.FLAG_ACTIVITY_NEW_TASK


    startActivity(intent)
}

    }
}