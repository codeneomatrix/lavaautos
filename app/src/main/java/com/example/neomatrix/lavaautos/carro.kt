package com.example.neomatrix.lavaautos

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton

class carro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carro)


        val citar = findViewById(R.id.siguiente) as Button

        val auto = findViewById(R.id.auto) as RadioButton
        val camioneta = findViewById(R.id.camioneta) as RadioButton

        auto.isChecked = true

        auto.setOnClickListener(object : View.OnClickListener {
            internal var camioneta = findViewById(R.id.camioneta) as RadioButton

            override fun onClick(view: View) {
                val au = application as ClaseGlobal
                au.ponauto(1)
                if (camioneta.isChecked) {
                    camioneta.isChecked = false
                }
            }
        })

        camioneta.setOnClickListener(object : View.OnClickListener {
            internal var auto = findViewById(R.id.auto) as RadioButton

            override fun onClick(view: View) {
                val au = application as ClaseGlobal
                au.ponauto(2)
                if (auto.isChecked) {
                    auto.isChecked = false
                }
            }
        })

        citar.setOnClickListener {
            val crearhor = Intent(this@carro, lavado::class.java)
            startActivity(crearhor)
        }
    }

    public override fun onStop() {
        super.onStop()
        this.finish()
    }


}