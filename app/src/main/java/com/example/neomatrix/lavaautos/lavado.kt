package com.example.neomatrix.lavaautos

import android.content.Intent
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton

class lavado : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lavado)

        val citar = findViewById(R.id.button) as Button


        ///-----------------------------------------------------------------------------------------
        val o1 = findViewById(R.id.o1) as RadioButton

        o1.isChecked = true


        citar.setOnClickListener {
            val crearhor = Intent(this@lavado, hora::class.java)
            startActivity(crearhor)
        }
    }

    public override fun onStop() {
        super.onStop()
        this.finish()
    }


}
