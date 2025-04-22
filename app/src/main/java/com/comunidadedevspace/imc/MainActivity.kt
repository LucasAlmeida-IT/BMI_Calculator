package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
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

            val pesoStr: String = edtpeso.text.toString()
            val alturaStr: String = edtaltura.text.toString()

            if (pesoStr == "" || alturaStr == ""){
                //mostrar mensagen para o usuário
                Snackbar.make(
                    edtpeso,
                    "Preencha todos os campos",
                    Snackbar.LENGTH_LONG
                )
                .show()

            } else {

                val peso: Float = pesoStr.toFloat()
                val altura: Float = alturaStr.toFloat()


                val alturaQ2 = altura * altura
                val resultado = peso / alturaQ2

                println("Ação do Botão " + resultado)
            }

        }

    }
}