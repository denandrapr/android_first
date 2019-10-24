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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_course);
        jgv = (GridView)findViewById(R.id.isi);
        AdapterCuy xxx = new AdapterCuy(getApplicationContext(),gambar,judul);
        jgv.setAdapter(xxx);

        jgv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(GridView_course.this, judul[i], Toast.LENGTH_SHORT).show();
            }
        });
    }

}
