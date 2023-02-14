package com.example.firstbasicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val mensagem: EditText = findViewById(R.id.inputMsg)
        val btn: Button = findViewById(R.id.buttonSegredo)

        btn.setOnClickListener {
            mensagem.setText("Olá mundo")
        }

        val btn2: Button = findViewById(R.id.button4)

        btn2.setOnClickListener {
            val valor1: EditText = findViewById(R.id.val1)
            val valor2: EditText = findViewById(R.id.val2)
            var valor3 = Integer.parseInt(valor1.text.toString()) + Integer.parseInt(valor2.text.toString())
            val text2: TextView = findViewById(R.id.textRes)
            text2.setText(valor3.toString())

        }
    }
}
