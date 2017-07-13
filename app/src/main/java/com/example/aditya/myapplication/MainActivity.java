package com.example.aditya.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.github.paolorotolo.expandableheightlistview.ExpandableHeightListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data d1=new data("COE 1","COE 2","1st august","1:30");
        data[] dat={
                d1,d1,d1,d1,d1,d1
        };
        ExpandableHeightListView listView = (ExpandableHeightListView) findViewById(R.id.lv);
        adapter myAdapter = new adapter(this, Arrays.asList(dat));
        listView.setExpanded(true);

        listView.setAdapter(myAdapter);
        dataf2 df1=new dataf2("ICE 1","ICE 2","2nd august","2:0");
        dataf2[] dataf2={
                df1,df1,df1,df1,df1,df1
        };
        ExpandableHeightListView listView2 = (ExpandableHeightListView) findViewById(R.id.lv2);
        adapter2 myAdapter2 = new adapter2(this, Arrays.asList(dataf2));
        listView2.setExpanded(true);
        listView2.setAdapter(myAdapter2);
    }
}
