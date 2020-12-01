package com.rfa.restoranujk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PaketB extends AppCompatActivity {
    EditText et1, et2, et3;
    TextView et0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paket_b);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        et0 = findViewById(R.id.textView);
        et1 = findViewById(R.id.et_harga);
        et2 = findViewById(R.id.et_jumlah);
        et3 = findViewById(R.id.et_jumlahDiskon);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    public void keHitung(View view) {
        Intent move = new Intent(PaketB.this, HitungPesanan.class);
        move.putExtra("Menu Paket", et0.getText());
        move.putExtra("Harga", Integer.parseInt(et1.getText().toString()));
        move.putExtra("Jumlah", Integer.parseInt(et2.getText().toString()));
        move.putExtra("Diskon", Integer.parseInt(et3.getText().toString()));
        startActivity(move);
    }
}