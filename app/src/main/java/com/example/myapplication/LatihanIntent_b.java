package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class LatihanIntent_b extends AppCompatActivity {

    EditText txtNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan_intent_b);

        txtNama = (EditText)findViewById(R.id.txtNama);
        Intent i = getIntent();
        txtNama.setText(i.getStringExtra("Nama"));



    }
}
