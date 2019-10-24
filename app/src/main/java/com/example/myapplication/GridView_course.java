package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class GridView_course extends AppCompatActivity {

    GridView jgv;
    int gambar[] = {R.drawable.ayam, R.drawable.bebek, R.drawable.lele};
    String judul[]={"Ayam Geprek","Ayam Penyet","Lele Goreng","Es Teh","Es Jeruk","Es Cao"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_course);
        jgv = (GridView)findViewById(R.id.isi);
        AdapterCuy xxx = new AdapterCuy(getApplicationContext(),gambar,judul);
        jgv.setAdapter(xxx);
    }

}
