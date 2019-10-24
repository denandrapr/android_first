package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class GridView_course extends AppCompatActivity {

    GridView jgv;
    int gambar[] = {R.drawable.ayam, R.drawable.bebek, R.drawable.lele, R.drawable.esjeruk};
    String judul[]={"Ayam Geprek","Ayam Penyet","Lele Goreng","Es Jeruk"};
    String harga[]={"10.000","16.0000","13.000","5000"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_course);
        jgv = (GridView)findViewById(R.id.isi);
        AdapterCuy xxx = new AdapterCuy(getApplicationContext(),gambar,judul, harga);
        jgv.setAdapter(xxx);

        jgv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(GridView_course.this, judul[i]+"\n"+harga[i], Toast.LENGTH_SHORT).show();
            }
        });
    }

}
