package com.ups.softwarelibre.recetas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   TextView tvRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tvRegistro= (TextView) findViewById(R.id.tv_registro);
        tvRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intentRegist;
                intentRegist =new Intent(MainActivity.this, registrar.class  );
                MainActivity.this.startActivity(intentRegist);

            }
        });

    }
}