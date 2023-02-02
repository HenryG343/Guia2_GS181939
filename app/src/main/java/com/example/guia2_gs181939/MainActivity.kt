package com.example.guia2_gs181939

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

lateinit var n1: EditText
lateinit var n2: EditText
lateinit var enviar: Button
lateinit var resultado: TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        n1 = findViewById(R.id.TxtN1)
        n2 = findViewById(R.id.TxtN2)
        enviar = findViewById(R.id.BtnEnviar)
        resultado = findViewById(R.id.LlbResultado)

        enviar.setOnClickListener{
            try {
                var respuesta: Float = n1.text.toString().toFloat() + n2.text.toString().toFloat()
                resultado.setText(respuesta.toString())
            }catch (ex:Exception){
                Toast.makeText(this,"Ingrese los datos correctamente",Toast.LENGTH_SHORT).show()
            }

        }

    }
}