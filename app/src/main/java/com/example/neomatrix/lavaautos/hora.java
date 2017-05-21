package com.example.neomatrix.lavaautos;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.icu.util.Calendar;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.Time;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;



public class hora extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hora);

        Button citar = (Button) findViewById(R.id.button2);
        Button hora = (Button) findViewById(R.id.elehora);

        Button elefecha = (Button) findViewById(R.id.elefecha);

        elefecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent crearpago = new Intent(hora.this, fecha.class);
                startActivity(crearpago);

            }
        });


        Button elehora = (Button) findViewById(R.id.elehora);

        elehora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent crearpago = new Intent(hora.this, elehora.class);
                startActivity(crearpago);

            }
        });


        citar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent crearpago = new Intent(hora.this, pago.class);
                startActivity(crearpago);

            }
        });
    }

    @Override
    public void onStop(){
        super.onStop();
        this.finish();
    }
}
