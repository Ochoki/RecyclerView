package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    ArrayList<Integer> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayList=new ArrayList<>();

        RecyclerView recyclerView = findViewById(R.id.rv);
recyclerView.setLayoutManager(new LinearLayoutManager(this));

        for (int i=0;i<10;i++){

            arrayList.add(i);

            TextView textView = new TextView(this);
            textView.setText(String.valueOf(i));



        }

MyAdapter myAdapter=new MyAdapter(arrayList);
        recyclerView.setAdapter(myAdapter);

        myAdapter.addItems(arrayList);
        //remove 1 2
        //replace item




    }







}
