package com.example.xinterv.Adapter;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;

import com.example.xinterv.R;

public class VehiculeAdapter extends CursorAdapter {

    public VehiculeAdapter(Context context, Cursor cursor, int flag){
        super(context, cursor, 0);
    }

    public void bindView(View view, Context context, Cursor cursor) {

    }

    public View newView(Context context, Cursor cursor, ViewGroup parent){
        return LayoutInflater.from(context).inflate(R.layout.activity_list_car, parent, false);
    }
}
