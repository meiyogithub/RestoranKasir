package com.rfa.restoranujk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class HitungPesanan extends AppCompatActivity {
    EditText et1, et2, et3, et4, et5,et6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_pesanan);

        et1 = findViewById(R.id.et_menuPaket);
        et2 = findViewById(R.id.et_harga);
        et3 = findViewById(R.id.et_jumlah);
        et4 = findViewById(R.id.et_jumlahHargaPesanan);
        et5 = findViewById(R.id.et_jumlahDiskon);
        et6 = findViewById(R.id.et_totalBayar);

        et1.setText(getIntent().getStringExtra("Menu Paket"));

        Integer harga = getIntent().getIntExtra("Harga",0);
        et2.setText(String.valueOf(harga));

        Integer jumlah = getIntent().getIntExtra("Jumlah",0);
        et3.setText(String.valueOf(jumlah));

        Integer jumlahHargaPesanan = harga * jumlah;
        et4.setText(String.valueOf(jumlahHargaPesanan));

        Integer diskon = getIntent().getIntExtra("Diskon",0);
        Integer jumlahDiskon = jumlahHargaPesanan * diskon / 100;

        et5.setText(String.valueOf(jumlahDiskon));

        Integer totalBayar = jumlahHargaPesanan - jumlahDiskon;
        et6.setText(String.valueOf(totalBayar));

    }

    public void keMenuUtama(View view) {
        Intent Utama = new Intent(HitungPesanan.this,MainActivity.class);
        startActivity(Utama);
    }
}