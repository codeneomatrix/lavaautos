package com.example.neomatrix.lavaautos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.design.widget.Snackbar;
import android.widget.CheckBox;
import android.widget.EditText;


public class crearcita extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crearcita);

        Button citar = (Button) findViewById(R.id.botoncita);
        CheckBox hombre = (CheckBox) findViewById(R.id.checkBox2);
        CheckBox mujer = (CheckBox) findViewById(R.id.checkBox);

        EditText nombre =(EditText) findViewById(R.id.nombre);

        mujer.setChecked(true);

        nombre.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                EditText nombre =(EditText) findViewById(R.id.nombre);
                String nom = nombre.getText().toString();

                if((nom.equals("Nombre"))== true ){
                    nombre.setText("");
                }

            }
        });

        hombre.setOnClickListener(new View.OnClickListener() {
            CheckBox mujer = (CheckBox) findViewById(R.id.checkBox);
            @Override
            public void onClick(View view) {
                if(mujer.isChecked()){
                    mujer.setChecked(false);
                }
            }
            });

        mujer.setOnClickListener(new View.OnClickListener() {
            CheckBox hombre = (CheckBox) findViewById(R.id.checkBox2);
            @Override
            public void onClick(View view) {
                if(hombre.isChecked()){
                    hombre.setChecked(false);
                }
            }
        });

        citar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //EditText nombre = (EditText) findViewById(R.id.nombre);

                //EditText hora = (EditText) findViewById(R.id.hora);
                //EditText fecha = (EditText) findViewById(R.id.fecha);

                /*String valornombre  = (String) nombre.getText().toString();
                String valorhora  = (String) hora.getText().toString();
                String valorfecha  = (String) fecha.getText().toString();
                String valor  = valornombre + valorhora +valorfecha;
                Snackbar.make(view, "Cita creada", Snackbar.LENGTH_LONG)
                     .setAction("Action", null).show();*/


                Intent crearcit = new Intent(crearcita.this, carro.class);
                startActivity(crearcit);

            }
        });
    }

    @Override
    public void onStop(){
        super.onStop();
        this.finish();
    }


}
