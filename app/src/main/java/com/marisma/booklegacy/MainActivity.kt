package com.marisma.booklegacy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

import android.content.Intent

import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val welcomeText = findViewById<TextView>(R.id.welcomeText)
        val userEditText = findViewById<EditText>(R.id.userEditText)
        val imageView = findViewById<ImageView>(R.id.imageView)
        val nextButton = findViewById<Button>(R.id.nextButton)

        // Configurar el evento de clic del botón
        nextButton.setOnClickListener {
            val userName = userEditText.text.toString()

            // Ir a la actividad CreditActivity y pasar el nombre de usuario
            val intent = Intent(this, CreditActivity::class.java)
            intent.putExtra("USER_NAME", userName)
            startActivity(intent)
        }
    }
}
