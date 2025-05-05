package com.comunidadedevspace.imc

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

const val KEY_RESULT_BMI = "ResultActivity.BMI_KEY"

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val result = intent.getFloatExtra(KEY_RESULT_BMI,0f)
        val tvResult = findViewById<TextView>(R.id.tv_result)
        val tvClassification = findViewById<TextView>(R.id.tv_classification)
        tvResult.text = result.toString()

        val classification: String = if(result <= 18.5f){
            "THINNESS"
        } else if(result >= 18.5f && result <= 24.9){
            "NORMAL"
        } else if(result >= 25.0f && result <= 29.9){
            "OVERWEIGHT I"
        } else if(result >= 30.0f && result <= 39.9){
            "OBESITY"
        } else {
            "SEVERE OBESITY"
        }

        when (classification) {
            "THINNESS"          -> tvClassification.setTextColor(Color.parseColor("#F44336"))
            "NORMAL"            -> tvClassification.setTextColor(Color.parseColor("#4CAF50"))
            "OVERWEIGHT I"      -> tvClassification.setTextColor(Color.parseColor("#ECD172"))
            "OBESITY"           -> tvClassification.setTextColor(Color.parseColor("#F44336"))
            "SEVERE OBESITY"   -> tvClassification.setTextColor(Color.parseColor("#F44336"))
        }

        tvClassification.text = classification

    }
}