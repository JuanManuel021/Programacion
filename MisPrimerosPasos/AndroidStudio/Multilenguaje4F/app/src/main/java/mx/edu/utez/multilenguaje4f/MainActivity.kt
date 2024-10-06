package mx.edu.utez.multilenguaje4f

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1. Crear una fuenyte de datos
        val datos= listOf("Juan","Hanna","Ruben","Francisco")
        //2. Crear un adaptador
        //2.1 Contexto, 2.2 Layout (Diseño)2.3 Datos
        val adaptador=ArrayAdapter(this@MainActivity,
            android.R.layout.simple_list_item_1, datos)
        //3. Asignar el adaptador al ListView
        val lvLista=findViewById<ListView>(R.id.lvLista)
        lvLista.adapter=adaptador





        //3. Asignar el adaptador al ListView
        val spLista=findViewById<Spinner>(R.id.psLista)
        spLista.adapter=adaptador

    }
    }
