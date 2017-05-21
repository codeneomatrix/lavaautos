package com.example.neomatrix.lavaautos

import android.app.DatePickerDialog
import android.app.Dialog
import android.content.Intent
import android.icu.util.Calendar
import android.support.v4.app.DialogFragment
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.format.Time
import android.view.View
import android.widget.Button
import android.widget.DatePicker


class hora : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hora)

        val citar = findViewById(R.id.button2) as Button
        val hora = findViewById(R.id.elehora) as Button

        val elefecha = findViewById(R.id.elefecha) as Button

        elefecha.setOnClickListener {
            val crearpago = Intent(this@hora, fecha::class.java)
            startActivity(crearpago)
        }


        val elehora = findViewById(R.id.elehora) as Button

        elehora.setOnClickListener {
            val crearpago = Intent(this@hora, elehora::class.java)
            startActivity(crearpago)
        }


        citar.setOnClickListener {
            val crearpago = Intent(this@hora, pago::class.java)
            startActivity(crearpago)
        }
    }

    public override fun onStop() {
        super.onStop()
        this.finish()
    }
}
