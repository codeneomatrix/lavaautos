package com.example.neomatrix.lavaautos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class carro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carro);


        Button citar = (Button) findViewById(R.id.siguiente);

        RadioButton auto = (RadioButton) findViewById(R.id.auto);
        RadioButton camioneta = (RadioButton) findViewById(R.id.camioneta);

        auto.setChecked(true);

        auto.setOnClickListener(new View.OnClickListener() {
            RadioButton camioneta = (RadioButton) findViewById(R.id.camioneta);

            @Override
            public void onClick(View view) {
                ClaseGlobal au = (ClaseGlobal) getApplication();
                au.ponauto(1);
                if (camioneta.isChecked()) {
                    camioneta.setChecked(false);
                }
            }
        });

        camioneta.setOnClickListener(new View.OnClickListener() {
            RadioButton auto = (RadioButton) findViewById(R.id.auto);

            @Override
            public void onClick(View view) {
                ClaseGlobal au = (ClaseGlobal) getApplication();
                au.ponauto(2);
                if (auto.isChecked()) {
                    auto.setChecked(false);
                }
            }
        });

        citar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent crearhor = new Intent(carro.this, lavado.class);
                startActivity(crearhor);

            }
        });
    }

    @Override
    public void onStop(){
        super.onStop();
        this.finish();
    }


}