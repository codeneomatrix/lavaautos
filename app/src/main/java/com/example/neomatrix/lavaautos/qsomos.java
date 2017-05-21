package com.example.neomatrix.lavaautos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class qsomos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qsomos);

        Button citar = (Button) findViewById(R.id.button5);

        citar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent crearpago = new Intent(qsomos.this, MainActivity.class);
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
