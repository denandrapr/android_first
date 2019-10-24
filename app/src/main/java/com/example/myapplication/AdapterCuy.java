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
    LayoutInflater tempel;

    public AdapterCuy(Context x, int[] gambarnya, String[] judulnya){
        this.x = x;
        this.gambarnya = gambarnya;
        this.judulnya=judulnya;
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
        g.setImageResource(gambarnya[i]);
        j.setText(judulnya[i]);
        return view;
    }
}
