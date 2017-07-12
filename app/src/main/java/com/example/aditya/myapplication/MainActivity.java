package com.example.aditya.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data d1=new data("COE 1","COE 2","1st august","1:30");
        data[] dat={
                d1,d1
        };
        ListView listView = (ListView) findViewById(R.id.lv);
        adapter myAdapter = new adapter(this, Arrays.asList(dat));

        listView.setAdapter(myAdapter);
    }
}
