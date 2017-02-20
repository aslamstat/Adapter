package com.example.laptoppoint.arrayadapter;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView simpleList;
    ArrayList<item> animalList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList = (ListView) findViewById(R.id.simpleListView);
        animalList.add(new item("Stat", R.drawable.stat));

        animalList.add(new item("Aslam", R.drawable.ds));

        animalList.add(new item("Stat", R.drawable.stat));
        animalList.add(new item("Aslam", R.drawable.ds));
        animalList.add(new item("Stat", R.drawable.stat));
        animalList.add(new item("Aslam", R.drawable.ds));
        MyAdapter myAdapter = new MyAdapter(this, R.layout.list_view_items, animalList);
        simpleList.setAdapter(myAdapter);
    }
}