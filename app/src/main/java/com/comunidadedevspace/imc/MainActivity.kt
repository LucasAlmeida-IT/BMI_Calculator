package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Recuperar os componentes EditText
        //Criar uma variável e associá-la ao componente de UI(TextInputEditText)
        //Recuperar o botão da tela
        //Colocar ação no botão
        //Recuperar o texto digitado no edtpeso

        val edtpeso     = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtaltura   = findViewById<TextInputEditText>(R.id.edt_altura)
        val btnCalcular = findViewById<Button>(R.id.btn_calcular)

        btnCalcular.setOnClickListener{

            val peso = edtpeso.text
            val altura = edtaltura.text

            println("Ação do Botão" + peso)
        }

    }
}