package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterCuy extends BaseAdapter {
    Context x;
    int gambarnya[];
    String judulnya[];
    String harga[];
    LayoutInflater tempel;

    public AdapterCuy(Context x, int[] gambarnya, String[] judulnya, String[] harga){
        this.x = x;
        this.gambarnya = gambarnya;
        this.judulnya=judulnya;
        this.harga = harga;
        tempel = (LayoutInflater.from(x));
    }

    @Override
    public int getCount() {
        return gambarnya.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = tempel.inflate(R.layout.activity_adapter_cuy,null);
        ImageView g = (ImageView)view.findViewById(R.id.gambar);
        TextView j = (TextView)view.findViewById(R.id.tvjudul);
        TextView d = (TextView) view.findViewById(R.id.txtHarga);
        g.setImageResource(gambarnya[i]);
        j.setText(judulnya[i]);
        d.setText(harga[i]);
        return view;
    }
}
