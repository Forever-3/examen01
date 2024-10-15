package com.forever3.examen01

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.NumberPicker
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.Calendar

class MainActivity : AppCompatActivity() {

    private lateinit var txtPlayerName: EditText
    private lateinit var txtFunds: EditText
    private lateinit var numberPickerPieces: NumberPicker
    private lateinit var btnPlay: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        txtPlayerName = findViewById(R.id.etPlayerName)
        txtFunds = findViewById(R.id.etFunds)
        numberPickerPieces = findViewById(R.id.numberPickerPieces) //donde se escogen los dados
        btnPlay = findViewById(R.id.btnPlay)

        // Configura el NumberPicker
        numberPickerPieces.minValue = 2
        numberPickerPieces.maxValue = 3

        // Listener para el botón de jugar
        btnPlay.setOnClickListener {
            val playerName = txtPlayerName.text.toString()
            val funds = txtFunds.text.toString().toIntOrNull()
            val pieces = numberPickerPieces.value

            // Validaciones
            if (playerName.isEmpty()) {
                showToast("Por favor, ingresa tu nombre.")
                return@setOnClickListener
            }
            if (funds == null || funds < 2000000) {
                showToast("El monto de fondos debe ser al menos 2 millones.")
                return@setOnClickListener
            }
            if (pieces < 2) {
                showToast("Debes seleccionar al menos 2 dados.")
                return@setOnClickListener
            }

            // Envía los datos a LandActivity
            val intent = Intent(this, LandActivity::class.java).apply {
                putExtra("PLAYER_NAME", playerName)
                putExtra("FUNDS", funds)
                putExtra("PIECES", pieces)
            }
            startActivity(intent)
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
