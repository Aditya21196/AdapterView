package com.example.aditya.myapplication;

/**
 * Created by aditya on 13/7/17.
 */

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by aditya on 13/7/17.
 */

public class adapter2 extends ArrayAdapter<dataf2> {

    public adapter2(Context context, List<dataf2> dataf2) {
        super(context, R.layout.custom_row2, dataf2);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater lf= LayoutInflater.from(getContext());
        View customView = lf.inflate(R.layout.custom_row2,parent,false);
        dataf2 rData = getItem(position);
        TextView tv_t1 = (TextView) customView.findViewById(R.id.t1f2);
        TextView tv_t2 = (TextView) customView.findViewById(R.id.t2f2);
        TextView tv_date = (TextView) customView.findViewById(R.id.datef2);
        TextView tv_score = (TextView) customView.findViewById(R.id.Score);
        tv_t1.setText(rData.team1);
        tv_t2.setText(rData.team2);
        tv_date.setText(rData.date);
        tv_score.setText(rData.score);
        return customView;
    }
}
