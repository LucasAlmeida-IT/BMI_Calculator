package com.comunidadedevspace.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Retrieve the EditText components
        //Create a variable and associate it with the UI component(TextInputEditText)
        //Retrieve the screen button
        //Put action on the button
        //Retrieve the text entered in edtweight

        val edtweight     = findViewById<TextInputEditText>(R.id.edt_weight)
        val edtheight   = findViewById<TextInputEditText>(R.id.edt_height)
        val btnCalculate = findViewById<Button>(R.id.btn_calculate)

        btnCalculate.setOnClickListener{

            val weightStr: String = edtweight.text.toString()
            val heightStr: String = edtheight.text.toString()

            if (weightStr == "" || heightStr == ""){
                //show message to user
                Snackbar.make(
                    edtweight,
                    "Please, fill in all fields",
                    Snackbar.LENGTH_LONG
                )
                .show()

            } else {

                val weight: Float = weightStr.toFloat()
                val height: Float = heightStr.toFloat()


                val heightQ2 = height * height
                val result = weight / heightQ2

                //Navigate to the next screen
                //Create next screen layout
                //Pass data (result) to next screen

                //Intent - Class from Android Studio

                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra(KEY_RESULT_BMI,result)
                startActivity(intent)

                //Colors
                //EditText background + Icon
                //Gradient + Icon + Title + Description

            }

        }

    }
}