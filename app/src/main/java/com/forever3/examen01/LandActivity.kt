package com.forever3.examen01

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LandActivity : AppCompatActivity() {

    private lateinit var lblPlayerName: TextView
    private lateinit var lblFunds: TextView
    private lateinit var lblPieces: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_land)

        // Inicializa los TextViews
        lblPlayerName = findViewById(R.id.lblPlayerName)
        lblFunds = findViewById(R.id.lblFunds)
        //lblPieces = findViewById(R.id.lblPieces) deberia recibir la cantidad de dados

        // Obtiene los datos del Intent
        val playerName = intent.getStringExtra("PLAYER_NAME")
        val funds = intent.getIntExtra("FUNDS", 0)
        val pieces = intent.getIntExtra("PIECES", 2)

        // Establece los valores en los TextViews
        lblPlayerName.text = playerName ?: "No disponible"
        lblFunds.text = "$$funds"
        lblPieces.text = pieces.toString()
    }
}
