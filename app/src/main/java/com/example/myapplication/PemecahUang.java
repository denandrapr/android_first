package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PemecahUang extends AppCompatActivity {

    EditText input;
    Button proses;
    TextView limaribu, duaribu, seribu, limaratus, duaratus, seratus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemecah_uang);

        input = (EditText)findViewById(R.id.input);
        proses = (Button)findViewById(R.id.proses);
        limaribu = (TextView)findViewById(R.id.lima_ribu);
        duaribu = (TextView)findViewById(R.id.dua_ribu);
        seribu = (TextView)findViewById(R.id.seribuan);
        limaratus = (TextView)findViewById(R.id.lima_ratus);
        duaratus = (TextView)findViewById(R.id.dua_ratus);
        seratus = (TextView)findViewById(R.id.seratus);

        proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int x = Integer.parseInt(input.getText().toString());
                int LimaRibu = x/5000;
                int Sisa = x%5000;

                int DuaRibu = Sisa/2000;
                Sisa = Sisa%2000;

                int Seribu = Sisa/1000;
                Sisa = Sisa%1000;

                int LimaRatus = Sisa/500;
                Sisa = Sisa%500;

                int DuaRatus = Sisa/200;
                Sisa = Sisa%200;

                int Seratus= Sisa/100;
                Sisa = Sisa%100;

                limaribu.setText(Integer.toString(LimaRibu));
                duaribu.setText(Integer.toString(DuaRibu));
                seribu.setText(Integer.toString(Seribu));
                limaratus.setText(Integer.toString(LimaRatus));
                duaratus.setText(Integer.toString(DuaRatus));
                seratus.setText(Integer.toString(Seratus));


            }
        });



    }
}
