package com.unlam.contador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textHello: TextView
    lateinit var btnContar: Button
    lateinit var btnResetear: Button

    var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getViews()
        setListeners()
        initilize()
    }

    fun getViews() {
        textHello = findViewById(R.id.textView)
        btnContar = findViewById(R.id.btnContar)
        btnResetear = findViewById(R.id.btnResetear)
    }

    fun setListeners() {
        btnContar.setOnClickListener {

            sumarContador()
        }
        btnResetear.setOnClickListener {

            resetearContador()
        }
    }

    fun initilize() {
        resetearContador()

    }

    fun actualizarTextoContador() {
        textHello.text = "Ganado: $contador"
    }

    fun sumarContador() {
        contador++
        actualizarTextoContador()
    }

    fun resetearContador() {
        contador = 0
        actualizarTextoContador()


    }


}
