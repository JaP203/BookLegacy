package com.marisma.booklegacy
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CreditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val direccionesCorreo = arrayOf("correo1@example.com")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_credit)

        val userName = intent.getStringExtra("USER_NAME")

        val creditText = findViewById<TextView>(R.id.creditText)
        val contactButton = findViewById<Button>(R.id.contactButton)
        // Mostrar el mensaje con el nombre de usuario
        creditText.text = userName+", estás usando la versión 1 de BookLegacy\n\nDescripción de la aplicación."
        // Configurar el evento de clic del botón de contacto
        contactButton.setOnClickListener {
            composeEmail(direccionesCorreo,"VA")
        }
    }


    fun composeEmail(addresses: Array<String>, subject: String?) {
        val intent = Intent(Intent.ACTION_SENDTO)
        intent.data = Uri.parse("mailto:") // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, addresses)
        intent.putExtra(Intent.EXTRA_SUBJECT, subject)
            startActivity(intent)

    }
}
