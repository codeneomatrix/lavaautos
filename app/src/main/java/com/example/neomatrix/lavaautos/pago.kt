package com.example.neomatrix.lavaautos

import android.content.Intent
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView

import org.w3c.dom.Text


class pago : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pago)

        val citar = findViewById(R.id.button3) as Button
        val texto = findViewById(R.id.total) as TextView

        val au = application as ClaseGlobal


        if (au.dameauto() == 1) {
            texto.text = "Total: $936.71"
        }
        if (au.dameauto() == 2) {
            texto.text = "Total: $1,364.00"
        }


        citar.setOnClickListener {
            val crearpago = Intent(this@pago, fin::class.java)
            startActivity(crearpago)
        }

    }

    public override fun onStop() {
        super.onStop()
        this.finish()
    }
}
