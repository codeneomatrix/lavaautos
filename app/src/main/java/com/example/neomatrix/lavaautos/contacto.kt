package com.example.neomatrix.lavaautos

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class contacto : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacto)

        val citar = findViewById(R.id.button6) as Button

        citar.setOnClickListener {
            val crearpago = Intent(this@contacto, MainActivity::class.java)
            startActivity(crearpago)
        }
    }

    public override fun onStop() {
        super.onStop()
        this.finish()
    }
}
