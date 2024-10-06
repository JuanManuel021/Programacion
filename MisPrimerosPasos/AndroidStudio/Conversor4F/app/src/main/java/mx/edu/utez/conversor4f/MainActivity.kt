package mx.edu.utez.conversor4f

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edtOrigen=findViewById<EditText>(R.id.edtOrigen);
        val edtDestino=findViewById<EditText>(R.id.edtDestino);
        val btnConvertir=findViewById<Button>(R.id.btnConvertir);
        val spOrigen=findViewById<Spinner>(R.id.spOrigen);
        val spDestino=findViewById<Spinner>(R.id.spDestino);
        //Datos
        val datos= listOf("MXN","USD","EUR","BGP")
        //Adaptador


        //Para pasarle los datos a los spiner se crea el adaptador
        //Contexto,Layaut,Datos
        val adaptador =ArrayAdapter(this@MainActivity,
            android.R.layout.simple_list_item_activated_1,datos)
        spOrigen.adapter=adaptador
        spDestino.adapter=adaptador

        //para cuando presionas el boton
        btnConvertir.setOnClickListener{
            //Validar cantidad en origen
            if (edtOrigen.text.toString() == ""){

                //para mostrar texto emergente
               // Toast.makeText(this@MainActivity,"Texto",Toast.LENGTH_SHORT).show()
                Toast.makeText(this@MainActivity,
                "Escribir una cantidad correcta",
                Toast.LENGTH_SHORT).show()
            }
            else{
                //Obtener el valor del edtOrigen
             //Para pasar un valor de String a int
                // val valorAnumero=edtOrigen.text.toString().toInt()
             val cantidadOrigen=edtOrigen.text.toString().toInt()


            //Guardar en variable la moneda origen y destino
                //guarda el valor en el que este posicionado el menu despegable
               // val guardaValor=spOrigen.selectedItem.toString()
                val monedaOrigen=spOrigen.selectedItem.toString()
                val monedaDestina=spDestino.selectedItem.toString()
               //Declarar variables
                // var variableUno=0;
                var cantidadDestino=0.0;

            //Convertir
                when(monedaOrigen){
                    "MXN"->{
                        when(monedaDestina){
                            "MXN"->{
                                cantidadDestino=cantidadOrigen*1.0;
                            }
                            "USD"->{
                                cantidadDestino=cantidadOrigen*0.051;
                            }
                            "EUR"->{
                                cantidadDestino=cantidadOrigen*0.046;
                            }
                            "GBP"->{
                                cantidadDestino=cantidadOrigen*0.38;
                            }
                        }
                    }
                    "USD"->{
                        when(monedaDestina){
                            "MXN"->{
                                cantidadDestino=cantidadOrigen*19.64;
                            }
                            "USD"->{
                                cantidadDestino=cantidadOrigen*1.0;
                            }
                            "EUR"->{
                                cantidadDestino=cantidadOrigen*0.90;
                            }
                            "GBP"->{
                                cantidadDestino=cantidadOrigen*0.75;
                            }
                            }
                    }
                    "EUR"->{
                        when(monedaDestina){
                            "MXN"->{
                                cantidadDestino=cantidadOrigen*21.88;
                            }
                            "USD"->{
                                cantidadDestino=cantidadOrigen*1.11;
                            }
                            "EUR"->{
                                cantidadDestino=cantidadOrigen*1.0;
                            }
                            "GBP"->{
                                cantidadDestino=cantidadOrigen*0.84;
                            }
                        }
                    }
                    "GBP"->{
                        when(monedaDestina){
                            "MXN"->{
                                cantidadDestino=cantidadOrigen*26.18;
                            }
                            "USD"->{
                                cantidadDestino=cantidadOrigen*1.33;
                            }
                            "EUR"->{
                                cantidadDestino=cantidadOrigen*1.20;
                            }
                            "GBP"->{
                                cantidadDestino=cantidadOrigen*1.0;
                            }
                        }
                    }
                }

            //Asignar el valor de la conversion en edtDestino
                edtDestino.setText(cantidadDestino.toString());
                //pasa el valor de la multiplicacion a variable para mostrar el texto
                //edtDestino.setText(cantidadDestino.toString())
        }
        }
        }
    }
//declarar variables
// Escribir en controles
// leer de controles
// diseñar pantallas