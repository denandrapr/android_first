package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kalkulator extends AppCompatActivity {

    EditText x, y;
    Button Penjumlahan, Pengurangan, Perkalian, Pembagian;
    TextView Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        x=(EditText)findViewById(R.id.x);
        y=(EditText)findViewById(R.id.y);

        Penjumlahan=(Button)findViewById(R.id.Penjumalahan);
        Pengurangan=(Button)findViewById(R.id.Pengurangan);
        Perkalian=(Button)findViewById(R.id.Perkalian);
        Pembagian=(Button)findViewById(R.id.Pembagian);

        Hasil=(TextView)findViewById(R.id.Hasil);

        Penjumlahan.setOnClickListener(new View.OnClickListener() {
            int a, b, c;

            @Override
            public void onClick(View view) {
                a=Integer.parseInt(x.getText().toString());
                b=Integer.parseInt(y.getText().toString());
                c=a+b;

                Hasil.setText(Double.toString(c));

            }
        });

        Pengurangan.setOnClickListener(new View.OnClickListener() {
            int a, b, c;

            @Override
            public void onClick(View view) {
                a=Integer.parseInt(x.getText().toString());
                b=Integer.parseInt(y.getText().toString());
                c=a-b;

                Hasil.setText(Double.toString(c));

            }
        });

        Perkalian.setOnClickListener(new View.OnClickListener() {
            int a, b, c;

            @Override
            public void onClick(View view) {
                a=Integer.parseInt(x.getText().toString());
                b=Integer.parseInt(y.getText().toString());
                c=a*b;

                Hasil.setText(Double.toString(c));

            }
        });

        Pembagian.setOnClickListener(new View.OnClickListener() {
            int a, b, c;

            @Override
            public void onClick(View view) {
                a=Integer.parseInt(x.getText().toString());
                b=Integer.parseInt(y.getText().toString());
                c=a/b;

                Hasil.setText(Double.toString(c));

            }
        });

    }
}
