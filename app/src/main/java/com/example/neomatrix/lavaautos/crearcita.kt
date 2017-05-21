package com.example.neomatrix.lavaautos

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.support.design.widget.Snackbar
import android.widget.CheckBox
import android.widget.EditText


class crearcita : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crearcita)

        val citar = findViewById(R.id.botoncita) as Button
        val hombre = findViewById(R.id.checkBox2) as CheckBox
        val mujer = findViewById(R.id.checkBox) as CheckBox

        val nombre = findViewById(R.id.nombre) as EditText

        mujer.isChecked = true

        nombre.setOnClickListener {
            val nombre = findViewById(R.id.nombre) as EditText
            val nom = nombre.text.toString()

            if (nom == "Nombre" == true) {
                nombre.setText("")
            }
        }

        hombre.setOnClickListener(object : View.OnClickListener {
            internal var mujer = findViewById(R.id.checkBox) as CheckBox
            override fun onClick(view: View) {
                if (mujer.isChecked) {
                    mujer.isChecked = false
                }
            }
        })

        mujer.setOnClickListener(object : View.OnClickListener {
            internal var hombre = findViewById(R.id.checkBox2) as CheckBox
            override fun onClick(view: View) {
                if (hombre.isChecked) {
                    hombre.isChecked = false
                }
            }
        })

        citar.setOnClickListener {
            //EditText nombre = (EditText) findViewById(R.id.nombre);

            //EditText hora = (EditText) findViewById(R.id.hora);
            //EditText fecha = (EditText) findViewById(R.id.fecha);

            /*String valornombre  = (String) nombre.getText().toString();
                String valorhora  = (String) hora.getText().toString();
                String valorfecha  = (String) fecha.getText().toString();
                String valor  = valornombre + valorhora +valorfecha;
                Snackbar.make(view, "Cita creada", Snackbar.LENGTH_LONG)
                     .setAction("Action", null).show();*/


            val crearcit = Intent(this@crearcita, carro::class.java)
            startActivity(crearcit)
        }
    }

    public override fun onStop() {
        super.onStop()
        this.finish()
    }


}
