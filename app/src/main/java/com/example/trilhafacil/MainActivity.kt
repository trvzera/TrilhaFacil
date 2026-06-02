package com.example.trilhafacil

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val txtTitulo = findViewById<TextView>(R.id.textView)
        val editNomeTrilha = findViewById<EditText>(R.id.editTextText)
        val btnPlanejar = findViewById<Button>(R.id.button3)

        btnPlanejar.setOnClickListener {
            val nomeTrilha = editNomeTrilha.text.toString().trim()

            if (nomeTrilha.isEmpty()) {
                Toast.makeText(this, "Por favor, digite o nome de uma trilha!", Toast.LENGTH_SHORT)
                    .show()
            } else {
                txtTitulo.text = "Próxima aventura: $nomeTrilha!"

                Toast.makeText(
                    this,
                    "Trilha '$nomeTrilha' planejada com sucesso! 🥾",
                    Toast.LENGTH_LONG
                ).show()

                editNomeTrilha.text.clear()
            }
        }
    }
}