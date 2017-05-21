package com.example.neomatrix.lavaautos;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;


public class pago extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pago);

        Button citar = (Button) findViewById(R.id.button3);
        TextView texto = (TextView) findViewById(R.id.total);

        ClaseGlobal au=(ClaseGlobal)getApplication();


        if(au.dameauto()==1){
            texto.setText("Total: $936.71");
        }
        if(au.dameauto()==2){
            texto.setText("Total: $1,364.00");
        }


        citar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent crearpago = new Intent(pago.this, fin.class);
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
