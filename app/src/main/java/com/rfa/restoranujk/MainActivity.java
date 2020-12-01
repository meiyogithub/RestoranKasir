package com.rfa.restoranujk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void kePaketA(View view) {
        Intent A = new Intent(MainActivity.this, PaketA.class);
        startActivity(A);
    }

    public void kePaketB(View view) {
        Intent B = new Intent(MainActivity.this, PaketB.class);
        startActivity(B);
    }

    public void kePaketC(View view) {
        Intent C= new Intent(MainActivity.this, PaketC.class);
        startActivity(C);
    }

    public void kePaketD(View view) {
        Intent D = new Intent(MainActivity.this, PaketD.class);
        startActivity(D);
    }

    public void kePaketE(View view) {
        Intent E = new Intent(MainActivity.this, PaketE.class);
        startActivity(E);
    }

    public void kePaketF(View view) {
        Intent F = new Intent(MainActivity.this, PaketF.class);
        startActivity(F);
    }
}