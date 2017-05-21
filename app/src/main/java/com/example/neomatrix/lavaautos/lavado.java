package com.example.neomatrix.lavaautos;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class lavado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lavado);

        Button citar = (Button) findViewById(R.id.button);


        ///-----------------------------------------------------------------------------------------
        RadioButton o1 = (RadioButton) findViewById(R.id.o1);

        o1.setChecked(true);


        citar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent crearhor = new Intent(lavado.this, hora.class);
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
