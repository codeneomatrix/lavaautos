package com.example.neomatrix.lavaautos

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class qsomos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qsomos)

        val citar = findViewById(R.id.button5) as Button

        citar.setOnClickListener {
            val crearpago = Intent(this@qsomos, MainActivity::class.java)
            startActivity(crearpago)
        }
    }

    public override fun onStop() {
        super.onStop()
        this.finish()
    }
}
