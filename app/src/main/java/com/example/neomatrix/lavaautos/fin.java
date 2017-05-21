package com.example.neomatrix.lavaautos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class fin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fin);

        ImageView pagar = (ImageView) findViewById(R.id.imageView3);

        pagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent crearpago = new Intent(fin.this, MainActivity.class);
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
