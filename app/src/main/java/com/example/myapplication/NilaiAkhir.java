package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NilaiAkhir extends AppCompatActivity {

    EditText uts, uas, tugas;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nilai_akhir);

        uts = (EditText)findViewById(R.id.uts);
        uas = (EditText)findViewById(R.id.uas);
        tugas = (EditText)findViewById(R.id.tugas);

        hitung = (Button)findViewById(R.id.hitung);
        hasil = (TextView)findViewById(R.id.nilai);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double x=0.3*Double.parseDouble(uts.getText().toString())+
                        0.4*Double.parseDouble(uas.getText().toString())+
                        0.3*Double.parseDouble(tugas.getText().toString());

                if (x>=80 && x<=100){
                    hasil.setText("A");
                }else if(x>=70 && x<=79){
                    hasil.setText("B");
                }else if(x>=60 && x<=69){
                    hasil.setText("C");
                }else if(x>=50 && x<=59){
                    hasil.setText("D");
                }else{
                    hasil.setText("E");
                }
            }
        });


    }
}
