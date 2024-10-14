package com.forever3.examen01

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.DatePicker
import android.widget.NumberPicker
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    /*
    private lateinit var txtplayerName: EditText
    private lateinit var txtfunds: EditText
    private lateinit var txtbirthdate: DatePicker
    private lateinit var txtpieces: NumberPicker

    private lateinit var btnPlay: Button

    private var playerName: String = ""
    private var funds: String = ""
*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
    /*
        txtplayerName = findViewById(R.id.txtplayerName)
        txtfunds = findViewById(R.id.txtfunds)
        txtbirthdate = findViewById(R.id.birthdate)
        txtpieces = findViewById(R.id.txtpieces)
        btnPlay = findViewById(R.id.btnPlay)

        // Configura el NumberPicker
        val numberPicker = findViewById<NumberPicker>(R.id.txtpieces)
        numberPicker.minValue = 2  // Valor mínimo
        numberPicker.maxValue = 3  // Valor máximo

        // Restablece los datos después de la rotación


        btnPlay.setOnClickListener {
            playerName = txtplayerName.text.toString()
            funds = txtfunds.text.toString()


        }

     */
    }


}