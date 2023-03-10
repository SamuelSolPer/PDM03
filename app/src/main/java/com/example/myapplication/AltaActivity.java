package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AltaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altas);
    }
    public void pulsadoBoton(View v) {
        Intent data = new Intent();

        if (v instanceof Button)
            data.putExtra("DATO", ((Button) v).getText());
        else
            data.putExtra("DATO", "A saber qué has pulsado");

        setResult(RESULT_OK, data);
        finish();
    }
}