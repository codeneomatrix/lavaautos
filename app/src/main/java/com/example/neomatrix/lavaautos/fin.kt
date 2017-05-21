package com.example.neomatrix.lavaautos

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast

class fin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fin)

        val pagar = findViewById(R.id.imageView3) as ImageView

        pagar.setOnClickListener {
            val crearpago = Intent(this@fin, MainActivity::class.java)
            startActivity(crearpago)
        }

    }

    public override fun onStop() {
        super.onStop()
        this.finish()
    }
}
