package com.example.neomatrix.lavaautos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fecha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fecha);

        Button citar = (Button) findViewById(R.id.aceptar);


        citar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent crearpago = new Intent(fecha.this, hora.class);
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
