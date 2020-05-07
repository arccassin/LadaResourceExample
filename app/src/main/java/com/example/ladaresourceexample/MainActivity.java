package com.example.ladaresourceexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_AUTO);
    }

    public void onChooseCarActivity(View view) {
        Spinner spinnerCar = findViewById(R.id.spinner);
        String choosenCar = String.valueOf(spinnerCar.getSelectedItem());

        final String[] cars = getResources().getStringArray(R.array.cars);
        if (choosenCar.equals(cars[0])){
            Intent intent = new Intent(this, LadaGrantaActivity.class);
            startActivity(intent);
        } else if (choosenCar.equals(cars[1])){
            Intent intent = new Intent(this, LadaPrioraActivity.class);
            startActivity(intent);
        } else if (choosenCar.equals(cars[2])){
            Intent intent = new Intent(this, LadaVestaActivity.class);
            startActivity(intent);
        }
    }
}
