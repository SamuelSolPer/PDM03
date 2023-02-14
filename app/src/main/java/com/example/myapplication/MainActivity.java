package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    int pulsaciones = 0;
    Button boton_pulsame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton_pulsame = (Button) findViewById(R.id.btnAlta);
        boton_pulsame.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AltaActivity.class);
                /** Llamada a la hija con startActivityForResult() nos               *
                 *  obliga a sobreescribir onActivityResult(), más abajo.            *
                 *  Se podría llamar con startActivity() si la hija no devuelve nada */

                startActivityForResult(intent, 11);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}