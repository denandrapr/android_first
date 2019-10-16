package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LatihanIntent_a extends AppCompatActivity {

    EditText txtNama;
    Button btnSimpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan_intent_a);

        txtNama = (EditText)findViewById(R.id.txtNama);
        btnSimpan = (Button)findViewById(R.id.btnSimpan);

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LatihanIntent_a.this, LatihanIntent_b.class);
                i.putExtra("Nama", txtNama.getText().toString());
                startActivity(i);
            }
        });

    }
}
